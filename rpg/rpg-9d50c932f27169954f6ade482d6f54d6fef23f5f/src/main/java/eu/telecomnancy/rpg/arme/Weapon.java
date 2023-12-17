package eu.telecomnancy.rpg.arme;

import lombok.Setter;
import lombok.Getter;

public class Weapon {
    @Setter
    @Getter
    private String name;

    public Weapon(String name2) {
    }

    @Setter
    @Getter
    protected int damage;
    
}
