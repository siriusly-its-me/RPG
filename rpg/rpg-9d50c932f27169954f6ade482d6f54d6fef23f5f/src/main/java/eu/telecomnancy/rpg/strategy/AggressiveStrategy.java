package eu.telecomnancy.rpg.strategy;

import eu.telecomnancy.rpg.personnage.GameCharacter;

public class AggressiveStrategy implements Strategy {

   public int attack(GameCharacter attacker){
    int damage;
    int base_attack = attacker.getLevel() * 4;
    int weapon_boost = 0 ;
    // ajouter bonus arme
    damage = base_attack + weapon_boost;
    return damage;
   }

    public int defense(GameCharacter defenser, int damage){
        int real_damage = 0;
        int base_defence = defenser.getDefense();
        int defense_strategy = base_defence/2; 
        real_damage = damage - defense_strategy;
        if (real_damage < 0){
            real_damage = 0;
        }
        return real_damage;

    }

}
