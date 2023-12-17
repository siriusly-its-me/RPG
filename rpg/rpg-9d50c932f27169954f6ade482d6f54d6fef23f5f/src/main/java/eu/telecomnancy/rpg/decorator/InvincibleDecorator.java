package eu.telecomnancy.rpg.decorator;

import eu.telecomnancy.rpg.strategy.Strategy;
import eu.telecomnancy.rpg.visitor.CharacterVisitor;
import eu.telecomnancy.rpg.personnage.Personnage;

// InvincibleDecorator.java (décorateur)
public class InvincibleDecorator extends Decorator {
    private Personnage personnage;


    public InvincibleDecorator(Personnage personnage) {
        super(personnage);
    }


    @Override
    public int getHealth(){
        int health = this.personnage.getHealth();
        if (health <= 0) {
            return 13;
        }
        return (int)(this.personnage.getHealth());
    }

    @Override
    public void accept(CharacterVisitor v, int value) {
        this.personnage.accept(v, value);
    }

    @Override
    public int attaquer(Strategy strategy) {
        return personnage.attaquer(strategy);
    }

}
