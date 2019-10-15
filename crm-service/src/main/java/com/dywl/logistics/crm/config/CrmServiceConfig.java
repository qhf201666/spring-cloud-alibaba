package com.dywl.logistics.crm.config;

import com.dywl.validate.spi.IValidationObject;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * @author 陈世峰
 */
@Configuration
@ComponentScan(basePackages = {
    "com.dywl.logistics.crm",
    "com.dywl.logistics.model.crm"
})

@MapperScan("com.dywl.logistics.model.order.mapper")
@ImportResource({"classpath:service-provider.xml"})
@DubboComponentScan(value = "com.dywl.logistics.order")
public class CrmServiceConfig {

    @Bean(name = "localeResolver")
    public LocaleResolver localResolver() {
        return new AcceptHeaderLocaleResolver();
    }

    @Bean
    public IValidationObject validationObject() {
        return (objects, aClass) -> {
            for (Object object : objects) {
                //todo Validation Object
               /* if (object instanceof DataEditInfo) {
                    return JSON.parseObject(((DataEditInfo) object).beanJson, aClass);
                }*/
            }
            return null;
        };
    }
}
