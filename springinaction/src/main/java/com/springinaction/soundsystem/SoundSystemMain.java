package com.springinaction.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoundSystemMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springinaction.soundsystem");
        CompactDisk obj = context.getBean(CompactDisk.class);
        obj.play();
    }
}
