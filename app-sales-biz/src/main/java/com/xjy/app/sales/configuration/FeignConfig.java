package com.xjy.app.sales.configuration;


import com.xjy.common.spring.cloud.FeignResultDecoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public FeignResultDecoder feignResultDecoder(ObjectFactory<HttpMessageConverters> messageConverters) {
        return new FeignResultDecoder(messageConverters);
    }

}
