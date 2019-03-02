package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {

    private final String title = "Sgt. Papper's Lonely Hearts Club Band";
    private final String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing: " + title + " by " + artist);
    }
}
