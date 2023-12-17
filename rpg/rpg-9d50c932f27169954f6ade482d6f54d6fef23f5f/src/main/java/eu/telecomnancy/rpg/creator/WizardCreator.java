package eu.telecomnancy.rpg.creator;

import eu.telecomnancy.rpg.personnage.Wizard;

public class WizardCreator extends CharacterCreator {
    @Override
    
    protected Wizard createCharacter(){
        return new Wizard("null");
    }

    
}
