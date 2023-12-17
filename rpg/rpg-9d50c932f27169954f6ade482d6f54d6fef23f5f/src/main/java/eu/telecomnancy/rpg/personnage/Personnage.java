package eu.telecomnancy.rpg.personnage;

import eu.telecomnancy.rpg.strategy.Strategy;
import eu.telecomnancy.rpg.visitor.CharacterVisitor;

public interface Personnage {

    public void accept(CharacterVisitor v, int value);
    public int attaquer(Strategy strategy);
    public int getHealth();
    public void setHealth(int newHealth);
    public int getDefense();

    
}
