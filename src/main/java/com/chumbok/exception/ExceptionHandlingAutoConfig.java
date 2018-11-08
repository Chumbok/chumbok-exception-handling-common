package com.chumbok.exception;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class ExceptionHandlingAutoConfig {

    private AbstractExceptionHandlerAdvice exceptionHandlerAdvice;

    public ExceptionHandlingAutoConfig(AbstractExceptionHandlerAdvice exceptionHandlerAdvice) {
        this.exceptionHandlerAdvice = exceptionHandlerAdvice;
    }

    @Bean
    public FilterRegistrationBean filterExceptionHandlerFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new FilterExceptionHandlerFilter(exceptionHandlerAdvice));
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registration;
    }

}