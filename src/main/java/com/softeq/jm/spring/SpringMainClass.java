package com.softeq.jm.spring;

import com.softeq.jm.spring.configs.SpringConfig;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by ydziadkouskaya on 6/25/2021.
 */


public class SpringMainClass extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static final String DEV_PROFILE = "dev";
    public static final String PROD_PROFILE = "prod";
    public static final String ACTIVE_PROFILE_PARAM = "spring.profiles.active";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}