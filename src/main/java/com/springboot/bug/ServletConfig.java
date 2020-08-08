
package com.springboot.bug;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.Resource;
import javax.servlet.MultipartConfigElement;

@Configuration
public class ServletConfig {

    @Resource
    private MultipartConfigElement multipartConfigElement;

    @Bean
    public ServletRegistrationBean apiServletBean(WebApplicationContext wac) {
        DispatcherServlet servlet = new DispatcherServlet(wac);
        servlet.setThrowExceptionIfNoHandlerFound(true);
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet);
        bean.setLoadOnStartup(1);
        bean.addUrlMappings( "/api/*");
        bean.setMultipartConfig(multipartConfigElement);
        bean.setName("apiServlet");
        return bean;
    }
}
