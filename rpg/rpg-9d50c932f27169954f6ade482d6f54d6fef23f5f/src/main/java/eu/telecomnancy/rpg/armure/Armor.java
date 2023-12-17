package eu.telecomnancy.rpg.armure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Armor {

    private String name;
    private int boost;

    public Armor(String name, int boost) {
        this.name = name;
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }

    
}
