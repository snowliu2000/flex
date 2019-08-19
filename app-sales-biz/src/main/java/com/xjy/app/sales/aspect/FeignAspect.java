package com.xjy.app.sales.aspect;


import com.xjy.common.web.Result;
import org.apache.commons.lang3.ArrayUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * FeignAspect
 * <p>
 * 一句话功能简述 功能详细描述
 *
 * @author hewei
 * @version [1.0.0, 2019/2/27]
 */
@Aspect
@Component
public class FeignAspect {

    @SuppressWarnings("unchecked")
    @Around("execution(* com.xjy.app.sales.house.delegate..*(..))")
    public Object pointcut(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        FeignConverter converter = signature.getMethod().getAnnotation(FeignConverter.class);
        if (converter == null) {
            return joinPoint.proceed();
        }
        String[] upper = converter.upper();
        String[] lower = converter.lower();
        Object arg = joinPoint.getArgs()[0];
        Field[] fields = arg.getClass().getDeclaredFields();
        try {
            setValue(fields, upper, arg, true);
            Object result = joinPoint.proceed();
            if (result instanceof Result) {
                Object data = ((Result) result).getData();
                if (data instanceof Collection) {
                    Collection<Object> collection = (Collection<Object>) data;
                    for (Object obj : collection) {
                        if (obj instanceof Map) {
                            Map<String, Object> item = (Map) obj;
                            toLower(lower, item);
                        }
                    }
                } else if (data instanceof Map) {
                    Map<String, Object> item = (Map) data;
                    toLower(lower, item);
                }
            }
            return result;
        } finally {
            setValue(fields, upper, arg, false);
        }
    }


    private void toLower(String[] lower, Map<String, Object> item) {
        for (Entry<String, Object> entry : item.entrySet()) {
            if (ArrayUtils.contains(lower, entry.getKey()) && entry.getValue() instanceof String) {
                entry.setValue(((String) entry.getValue()).toLowerCase());
            }
        }
    }

    private void setValue(Field[] fields, String[] include, Object target, boolean upper)
            throws IllegalAccessException {
        for (Field field : fields) {
            if (ArrayUtils.contains(include, field.getName())) {
                setValue(target, field, upper);
            }
        }
    }

    private void setValue(Object result, Field field, boolean upper) throws IllegalAccessException {
        field.setAccessible(true);
        Optional<String> op = Optional.ofNullable((String) field.get(result));
        String value = upper ? op.map(String::toUpperCase).orElse("") : op.map(String::toLowerCase).orElse("");
        field.set(result, value);
    }
}
