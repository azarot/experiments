package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.com.springinaction.knights");
        Knight obj = context.getBean(Knight.class);
        obj.embarkOnQuest();
    }
}
