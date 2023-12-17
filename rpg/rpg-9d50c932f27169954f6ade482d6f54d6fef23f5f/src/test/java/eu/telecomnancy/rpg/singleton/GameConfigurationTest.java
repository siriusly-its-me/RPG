package eu.telecomnancy.rpg.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameConfigurationTest {
    @Test
    void testgetInstance() {
        GameConfiguration game1 = new GameConfiguration();
        GameConfiguration game2 = new GameConfiguration();
        assertEquals(game2.instance, game1.instance );
        
    }

}