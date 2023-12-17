package eu.telecomnancy.rpg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Warrior;

public class CharacterTest {
    @Test
    void testCreateCharacter() {
        Warrior warrior = new Warrior("test");
        assertEquals(100, warrior.getHealth());
        
    }

    
}
