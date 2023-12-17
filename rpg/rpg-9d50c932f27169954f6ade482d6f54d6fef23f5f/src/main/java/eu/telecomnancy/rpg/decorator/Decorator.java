package eu.telecomnancy.rpg.decorator;

import eu.telecomnancy.rpg.visitor.CharacterVisitor;
import eu.telecomnancy.rpg.personnage.Personnage;



public abstract class Decorator implements Personnage {
    protected Personnage personnage_decore;

    public Decorator(Personnage perso) {
        this.personnage_decore = perso;
    }

    public int getHealth() {
        return this.personnage_decore.getHealth();
    }
    public int getDefense() {
        return this.personnage_decore.getDefense();
    }
    
    public void setHealth(int newHealth) {this.personnage_decore.setHealth(newHealth);}

    public void acceptVisitor(CharacterVisitor v, int value) {this.personnage_decore.accept(v, value);}
    
}

