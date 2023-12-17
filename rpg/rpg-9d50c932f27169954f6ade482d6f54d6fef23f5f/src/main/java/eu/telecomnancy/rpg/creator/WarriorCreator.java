package eu.telecomnancy.rpg.creator;

import eu.telecomnancy.rpg.personnage.Warrior;

public class WarriorCreator extends CharacterCreator {
    @Override
    
    protected Warrior createCharacter(){
        return new Warrior("null");
    }

    
}
