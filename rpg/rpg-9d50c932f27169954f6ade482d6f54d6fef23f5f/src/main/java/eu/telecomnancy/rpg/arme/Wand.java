package eu.telecomnancy.rpg.arme;

import java.util.Random;

public class Wand extends Weapon{
    public Wand(String name){
        super(name);
        damage = new Random().nextInt(10);

    }
    
}
