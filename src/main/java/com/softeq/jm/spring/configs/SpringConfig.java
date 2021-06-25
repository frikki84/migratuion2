package com.softeq.jm.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */

@Configuration
@ComponentScan("com.softeq.jm")
@EnableWebMvc
@EnableTransactionManagement
public class SpringConfig {

}
