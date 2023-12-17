package eu.telecomnancy.rpg.creator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Warrior;

public class WarriorCreatorTest {
    @Test
    void testWarriorCreator() {
        WarriorCreator warcr = new WarriorCreator();
        assertEquals(true, warcr.createCharacter() instanceof Warrior);
        
    }
    
    
}
