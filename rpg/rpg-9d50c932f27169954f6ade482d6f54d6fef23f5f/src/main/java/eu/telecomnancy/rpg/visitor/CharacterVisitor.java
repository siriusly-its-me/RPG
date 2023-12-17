package eu.telecomnancy.rpg.visitor;

import eu.telecomnancy.rpg.personnage.Healer;
import eu.telecomnancy.rpg.personnage.Warrior;
import eu.telecomnancy.rpg.personnage.Wizard;

public interface CharacterVisitor {
    public void visit(Warrior war, int value);
    public void visit(Wizard wiz, int value);
    public void visit(Healer hea, int value);
    
}