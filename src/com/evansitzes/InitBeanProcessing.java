package com.evansitzes;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by evan on 3/28/16.
 */
public class InitBeanProcessing implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(final Object bean, final String beanName) {
        System.out.println("Pre-Initialization message: " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, final String beanName) {
        System.out.println("Post-Initialization message: " + beanName);
        return bean;
    }
}
