package eu.telecomnancy.rpg.decorator;

import eu.telecomnancy.rpg.personnage.Personnage;
import eu.telecomnancy.rpg.strategy.Strategy;
import eu.telecomnancy.rpg.visitor.CharacterVisitor;

public class ArmoredDecorator extends Decorator {
    private Personnage personnage;

    public ArmoredDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public int getDefense(){
        return (int)(this.personnage.getDefense()*1.13);
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