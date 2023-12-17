package eu.telecomnancy.rpg.arme;

import java.util.Random;

public class Sword extends Weapon {
    public Sword(String name){
        super(name);
        damage = new Random().nextInt(10);

    }
    
}
