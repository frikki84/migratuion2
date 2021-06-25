package com.softeq.jm.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */


@Configuration
@EnableWebMvc
@ComponentScan("com.softeq.jm")
public class SpringMainClass implements WebMvcConfigurer {

    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver resolver
            = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}
