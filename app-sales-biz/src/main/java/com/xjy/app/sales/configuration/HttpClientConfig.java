package com.xjy.app.sales.configuration;


import com.xjy.common.util.HttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * http接口host信息配置
 *
 * @author jincheng
 * @version 1.0, 2019-02-18
 */
@Configuration
public class HttpClientConfig {

    @Bean
    public HttpClient httpClient() {
        return new HttpClient();
    }
    /* 金蝶接口 start */
    public static final String CP_PRESENT_URL = "cp-present.toonyoo.net";

    public static final String PRODUCT_PAY_TYPE_INFO_URL = "product/paytype/info";

    public static final String PRODUCT_OUT_STOCK_URL = "product/out/stock";
    /* 金蝶接口 end */
}
