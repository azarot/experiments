package com.springinaction.knights;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void testKnightEmbark() {
        final Quest quest = Mockito.spy(Quest.class);

        final BraveKnight braveKnight = new BraveKnight();

        braveKnight.embarkOnQuest();

        Mockito.verify(quest, Mockito.times(1)).embark();
    }

}
