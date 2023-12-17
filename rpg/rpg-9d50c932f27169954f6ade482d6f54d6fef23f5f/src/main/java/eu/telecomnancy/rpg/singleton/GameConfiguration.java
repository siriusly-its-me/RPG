package eu.telecomnancy.rpg.singleton;


public class GameConfiguration {
    Integer difficulty_level;
    Integer teammate;
    GameConfiguration instance;

    // Singleton

    public GameConfiguration getInstance(){
        if (instance == null){
            instance = new GameConfiguration();
        }
        return instance;

    }

    // Setters et getters

    public void setGameConfiguration(Integer difficulty, Integer team) {
        this.difficulty_level = difficulty;
        this.teammate = team;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty_level = difficulty;
    }

    public void setTeam(Integer team) {
        this.teammate = team;
    }

    public Integer getDifficulty(){
        return this.difficulty_level;
    }

    public Integer getTeam(){
        return this.teammate;
    }



}