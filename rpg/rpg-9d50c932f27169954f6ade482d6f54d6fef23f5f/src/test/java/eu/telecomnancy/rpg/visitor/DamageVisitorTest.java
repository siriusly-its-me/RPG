package eu.telecomnancy.rpg.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Warrior;
import eu.telecomnancy.rpg.strategy.AggressiveStrategy;

public class DamageVisitorTest {
    @Test
    public void testDamageVisitor() {
        Warrior warrior = new Warrior("test");
        DamageVisitor damageVisitor = new DamageVisitor();
        AggressiveStrategy agr = new AggressiveStrategy();
        warrior.setStrategy(agr);
        warrior.accept(damageVisitor, 10);
        assertEquals(94, warrior.getHealth());

}
    
}
