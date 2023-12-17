package eu.telecomnancy.rpg.personnage;

import eu.telecomnancy.rpg.visitor.CharacterVisitor;

import lombok.Getter;
import lombok.Setter;

public class Warrior extends GameCharacter {
    @Getter
    @Setter
    private int strength;

    public Warrior(String name) {
        super(name);
        strength = getLevel() * 10;
    }

    public void accept(CharacterVisitor visitor, int value){
        visitor.visit(this,value);
    }

    
}
