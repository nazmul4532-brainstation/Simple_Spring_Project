package com.example.demo.rest;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogController}.
 */
@Generated
public class LogController__BeanDefinitions {
  /**
   * Get the bean definition for 'logController'.
   */
  public static BeanDefinition getLogControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogController.class);
    beanDefinition.setInstanceSupplier(LogController::new);
    return beanDefinition;
  }
}
