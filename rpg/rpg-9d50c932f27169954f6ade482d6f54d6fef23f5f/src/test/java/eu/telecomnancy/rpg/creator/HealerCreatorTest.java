package eu.telecomnancy.rpg.creator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Healer;

public class HealerCreatorTest {
    @Test
    void testHealerCreator() {
        HealerCreator heacr = new HealerCreator();
        assertEquals(true, heacr.createCharacter() instanceof Healer);
        
    }
    
    
}
