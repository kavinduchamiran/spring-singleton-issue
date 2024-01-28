package com.kavinduchamiran.spring.config;

import com.kavinduchamiran.spring.beans.MyBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Kavindu
 */
@Configuration
public class Config {
    @Bean(name = "kavinduMyBean")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MyBean myBean() {
        return new MyBean();
    }
}
