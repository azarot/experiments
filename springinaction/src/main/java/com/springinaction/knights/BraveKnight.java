package com.springinaction.knights;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BraveKnight implements Knight {

    @Autowired(required = false)
    private List<Quest> quest = Collections.emptyList();

//    public BraveKnight(Quest quest) {
//        this.quest = quest;
//    }

    public void embarkOnQuest() {
//        quest.embark();
    }

}
