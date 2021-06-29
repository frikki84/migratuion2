package com.softeq.jm.filter;

import br.com.caelum.vraptor.VRaptor;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ydziadkouskaya on 6/28/2021.
 */

@WebFilter(
    filterName = "vraptor",
    urlPatterns = {"/home/*", "/company/*", "/login/*"},
    dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST},
    asyncSupported = true)

public class MigrationFilter extends VRaptor {
    private static final Set<String> EXCLUDE_PATHS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
        "/home/v2/home", "/login/v2/login", "/company/v2/companies", "/company/v2"
    )));

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
        System.out.println("REQUEST PATH " + path);
        boolean excludePath = EXCLUDE_PATHS.contains(path);
        System.out.println("BOOLEAN " + excludePath);

        if (excludePath) {
            chain.doFilter(req, res);           // spring

        } else {
            super.doFilter(req, res, chain);  //vraptor
        }
    }

}
