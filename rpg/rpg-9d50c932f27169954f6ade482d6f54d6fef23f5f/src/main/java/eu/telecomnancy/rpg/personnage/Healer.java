package eu.telecomnancy.rpg.personnage;

import eu.telecomnancy.rpg.visitor.CharacterVisitor;
import lombok.Getter;
import lombok.Setter;

public class Healer extends GameCharacter {
    @Getter
    @Setter
    private int wisdom;

    public Healer(String name) {
        super(name);
        wisdom = getLevel() * 10;
    }

    public void accept(CharacterVisitor visitor, int value){
        visitor.visit(this,value);
    }


    
}
