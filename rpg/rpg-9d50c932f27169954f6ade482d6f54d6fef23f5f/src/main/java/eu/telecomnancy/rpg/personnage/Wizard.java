package eu.telecomnancy.rpg.personnage;


import eu.telecomnancy.rpg.visitor.CharacterVisitor;
import lombok.Getter;
import lombok.Setter;

public class Wizard extends GameCharacter {
    @Getter
    @Setter
    private int intelligence;

    public Wizard(String name) {
        super(name);
        intelligence = getLevel() * 10;
    }

    public void accept(CharacterVisitor visitor, int value){
        visitor.visit(this,value);
    }

    
}
