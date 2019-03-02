package com.springinaction.knights;

import java.io.PrintStream;

import org.springframework.stereotype.Component;

@Component
public class SlayDragonQuest implements Quest {

    private final PrintStream stream = System.out;

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
