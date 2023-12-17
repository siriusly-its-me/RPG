package eu.telecomnancy.rpg.arme;

import java.util.Random;

public class Staff extends Weapon{
    public Staff(String name){
        super(name);
        damage = new Random().nextInt(10);


    }
    
}
