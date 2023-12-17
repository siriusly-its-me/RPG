package eu.telecomnancy.rpg.state;

import eu.telecomnancy.rpg.personnage.GameCharacter;

public class WoundedState implements State{
        private GameCharacter character;

    public WoundedState(GameCharacter character) {
        this.character = character;
    }
    
    @Override
    public void onEnterState() {
        System.out.println("You are wounded");
    }

    @Override
    public void onUpdate() {
        System.out.println("You are wounded");
    }

    @Override
    public void onTryToMove() {
        System.out.println("You are wounded");
    }

    @Override
    public void onAttack() {
        System.out.println("You are wounded");
    }
    
}
