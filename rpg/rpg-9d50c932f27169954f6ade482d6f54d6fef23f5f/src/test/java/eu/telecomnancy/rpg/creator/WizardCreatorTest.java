package eu.telecomnancy.rpg.creator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Wizard;

public class WizardCreatorTest {
    @Test
    void testWizardCreator() {
        WizardCreator wizcr = new WizardCreator();
        assertEquals(true, wizcr.createCharacter() instanceof Wizard);
        
    }
    
    
}
