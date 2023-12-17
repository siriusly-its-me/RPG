package eu.telecomnancy.rpg.state;

import eu.telecomnancy.rpg.personnage.GameCharacter;

public class ScaredState implements State{
        private GameCharacter character;

    public ScaredState(GameCharacter character) {
        this.character = character;
    }
    
    @Override
    public void onEnterState() {
        System.out.println("You are scared");
    }

    @Override
    public void onUpdate() {
        System.out.println("You are scared");
    }

    @Override
    public void onTryToMove() {
        System.out.println("You are scared");
    }

    @Override
    public void onAttack() {
        System.out.println("You are scared");
    }
    
}
