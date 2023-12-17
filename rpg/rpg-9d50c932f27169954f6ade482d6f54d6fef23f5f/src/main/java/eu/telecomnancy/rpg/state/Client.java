package eu.telecomnancy.rpg.state;

import eu.telecomnancy.rpg.personnage.Warrior;

public class Client {
    public static void main(String[] args) {
        Warrior character = new Warrior("bob");

        State normalState = new NormalState(character);
        State woundedState = new WoundedState(character);

        character.setState(normalState);
        character.update();
        character.tryToMove();


        System.out.println("-----");

        character.setState(woundedState);
        character.update();
        character.tryToMove();

    }
}
