package eu.telecomnancy.rpg.state;

import eu.telecomnancy.rpg.personnage.GameCharacter;

public class DeadState implements State {
        private GameCharacter character;

    public DeadState(GameCharacter character) {
        this.character = character;
    }
    
    @Override
    public void onEnterState() {
        System.out.println("You are dead");
    }

    @Override
    public void onUpdate() {
        System.out.println("You are dead");
    }

    @Override
    public void onTryToMove() {
        System.out.println("You are dead");
    }

    @Override
    public void onAttack() {
        System.out.println("You are dead");
    }
    
}
