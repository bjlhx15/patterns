package com.github.bjlhx15.patterns.base.create.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

//@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
//@ContextConfiguration({"classpath:applicationContext-012.xml"}) //加载配置文件
public class SpringBuilderTest {


    @Test
    public void testUriComponentsBuilder() {
        UriComponents build = UriComponentsBuilder.fromPath("").build();
    }
    @Test
    public void testSpringBuilder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-budiler.xml");

        PersonSpringBeanService personSpringBeanService = (PersonSpringBeanService) context.getBean("personSpringBeanService");
        if (personSpringBeanService != null) {
            personSpringBeanService.test();
        } else {
            System.out.println("没有personSpringBeanService bean");
        }

        //将applicationContext转换为ConfigurableApplicationContext
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;

        // 获取bean工厂并转换为DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();

        // 通过BeanDefinitionBuilder创建bean定义
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(PersonSpringBeanService.class);
        // 设置属性personSpringBeanDao,此属性引用已经定义的bean:personSpringBeanDao
        // beanDefinitionBuilder.addPropertyReference("personSpringBeanDao", "personSpringBeanDao");

        // 注册bean,第一个参数为BeanName
        defaultListableBeanFactory.registerBeanDefinition("personSpringBeanService", beanDefinitionBuilder.getRawBeanDefinition());

        PersonSpringBeanService personSpringBeanService1 = (PersonSpringBeanService) context.getBean("personSpringBeanService");
        personSpringBeanService1.test();
    }

}