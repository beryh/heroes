package com.posthappinism.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yh958 on 2017-05-20.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.posthappinism"}, excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
}