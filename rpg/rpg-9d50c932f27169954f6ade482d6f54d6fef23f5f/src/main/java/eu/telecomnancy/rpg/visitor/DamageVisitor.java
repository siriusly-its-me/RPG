package eu.telecomnancy.rpg.visitor;

import eu.telecomnancy.rpg.personnage.Healer;
import eu.telecomnancy.rpg.personnage.Warrior;
import eu.telecomnancy.rpg.personnage.Wizard;

public class DamageVisitor implements CharacterVisitor{
    @Override
    public void visit(Warrior war, int value) {
        int current_health = war.getHealth();
        war.setHealth(current_health - war.getStrategy().defense(war,value));
    }

    @Override
    public void visit(Wizard wiz, int value) {
        int current_health = wiz.getHealth();
        wiz.setHealth(current_health - wiz.getStrategy().defense(wiz,value));
    }

    @Override
    public void visit(Healer hea, int value) {
        int current_health = hea.getHealth();
        hea.setHealth(current_health - hea.getStrategy().defense(hea,value));
    }

}
