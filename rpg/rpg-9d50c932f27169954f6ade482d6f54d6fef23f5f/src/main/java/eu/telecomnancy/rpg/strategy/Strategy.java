package eu.telecomnancy.rpg.strategy;

import eu.telecomnancy.rpg.personnage.GameCharacter;


public interface Strategy {
    public int attack(GameCharacter attacker);
    public int defense(GameCharacter defenser, int damage);
}
