package eu.telecomnancy.rpg.visitor;

import eu.telecomnancy.rpg.personnage.Healer;
import eu.telecomnancy.rpg.personnage.Warrior;
import eu.telecomnancy.rpg.personnage.Wizard;

public class BuffVisitor implements CharacterVisitor{

    @Override
    public void visit(Healer hea, int value) {
        int current_wisdom = hea.getWisdom();
        hea.setWisdom(current_wisdom + value);
    }

    @Override
    public void visit(Warrior war, int value) {
        int current_strength = war.getStrength();
            war.setStrength(current_strength + value);
    }

    
    @Override
    public void visit(Wizard wiz, int value) {
        int current_intelligence = wiz.getIntelligence();
            wiz.setIntelligence(current_intelligence + value);
    }

        
   
    
    
    
}
