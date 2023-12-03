package com.mimu.simple;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    @Test
    public void Test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        for (String s : configApplicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}
