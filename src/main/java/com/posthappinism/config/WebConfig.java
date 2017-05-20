package com.posthappinism.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by yh958 on 2017-05-16.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("mainpage");
        registry.addViewController("/home").setViewName("mainpage");
        registry.addViewController("/login").setViewName("login");
    }

    @Bean
    public FilterRegistrationBean httpMethodFilter() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new HiddenHttpMethodFilter());
        filter.setName("httpMethodFilter");
        filter.addUrlPatterns("/*");
        return filter;
    }

}
