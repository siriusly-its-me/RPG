package eu.telecomnancy.rpg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Team;
import eu.telecomnancy.rpg.personnage.Wizard;

class TeamTest {

    @Test
    void testCreateTeam() {
        Team team = new Team("test");
        assertEquals(0, team.size());
        

    }

    @Test void AddCharacterToTeam() {
        Team team = new Team("test");
        Wizard character = new Wizard("test");
        team.addPlayer(character);
        assertEquals(1, team.size());
    }

}