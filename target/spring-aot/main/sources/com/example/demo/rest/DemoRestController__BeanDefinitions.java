package com.example.demo.rest;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DemoRestController}.
 */
@Generated
public class DemoRestController__BeanDefinitions {
  /**
   * Get the bean definition for 'demoRestController'.
   */
  public static BeanDefinition getDemoRestControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DemoRestController.class);
    beanDefinition.setInstanceSupplier(DemoRestController::new);
    return beanDefinition;
  }
}
