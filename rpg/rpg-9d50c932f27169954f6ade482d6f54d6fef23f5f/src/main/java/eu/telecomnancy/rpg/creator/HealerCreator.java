package eu.telecomnancy.rpg.creator;

import eu.telecomnancy.rpg.personnage.Healer;

public class HealerCreator extends CharacterCreator {
    @Override
    
    protected Healer createCharacter(){
        return new Healer("null");
    }

    
}
