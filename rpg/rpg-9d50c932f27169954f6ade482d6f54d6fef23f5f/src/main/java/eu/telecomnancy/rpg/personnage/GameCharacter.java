package eu.telecomnancy.rpg.personnage;

import java.util.List;

import eu.telecomnancy.rpg.observer.Observer;
import eu.telecomnancy.rpg.state.State;
import eu.telecomnancy.rpg.strategy.Strategy;

import eu.telecomnancy.rpg.armure.Armor;
import eu.telecomnancy.rpg.arme.Weapon;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString

@Getter
@Setter

public abstract class GameCharacter implements Personnage{
    private final String name;
    @Getter
    private int health;
    private int experiencePoints;
    private int level;

    private int base_attack;
    private int base_defense;

    private Strategy strategy;
    private List<Observer> observers;

     private State currentState;

    @Getter
    @Setter
    private Armor armor;
    private Weapon weapon;

    public GameCharacter(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.level = 1;
        this.health = 100 * this.level;
        this.armor = null;
        this.weapon = null;
    }


    // METHHODES POUR LE STATE PATTERN
    public void setState(State state) {
        this.currentState = state;
        currentState.onEnterState();
    }

    public void update() {
        currentState.onUpdate();
    }

    public void tryToMove() {
        currentState.onTryToMove();
    }

    // public void attack() {
    //     currentState.onAttack();
    // }


    //
    public void setBaseAttack(){
        this.base_attack = this.level * 4;
    }

    public int getBaseAttack(){
        return this.base_attack;
    }

    public int getAttack(){
        return this.base_attack + this.weapon.getDamage();
    }

    public void setBaseDefense(){
        this.base_defense = this.level * 4;
    }

    public int getBaseDefense(){
        return this.base_defense;
    }

    public int getDefense(){
        int boost = armureActive();
        return this.base_defense + boost;
    }


    public void setHealth(int health){
        this.health = health;
        if (this.health < 0){
            this.health = 0;
        }

    }

    public void getWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int attaquer(Strategy strategy){
        String strat = strategy.getClass().getSimpleName();
        switch(strat){
            case "AggressiveStrategy":
                return strategy.attack(this);
                
            case "DefensiveStrategy":
                return strategy.attack(this);
                
            default:
                return strategy.attack(this);
        }
    }

    public void levelUp(){
        if(this.getExperiencePoints()>=100){
            this.setExperiencePoints(getExperiencePoints()-100);
            for(Observer o : observers){
                o.isLevelingUp();
            }
        }
    }

    public void dead(){
        if(this.getHealth()<=0){
            for(Observer o : observers){
                o.isDead();
            }
        }
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public int armureActive() {
        if (this.getArmor() != null) {
            return this.getArmor().getBoost();
        }
        else {
            return 0;
        }
    }




}
