package eu.telecomnancy.rpg.state;

import eu.telecomnancy.rpg.personnage.GameCharacter;


public class NormalState implements State {
    private GameCharacter character;

    public NormalState(GameCharacter character) {
        this.character = character;
    }

        @Override
        public void onEnterState() {
            System.out.println("You are normal");
        }
    
        @Override
        public void onUpdate() {
            System.out.println("You are normal");
        }
    
        @Override
        public void onTryToMove() {
            System.out.println("You are normal");
        }
    
        @Override
        public void onAttack() {
            System.out.println("You are normal");
        }
    
}
