package eu.telecomnancy.rpg.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eu.telecomnancy.rpg.personnage.Warrior;

public class BuffVisitorTest{
    
    @Test
    public void testBuffVisitor() {
        Warrior warrior = new Warrior("test");
        BuffVisitor buffVisitor = new BuffVisitor();
        warrior.accept(buffVisitor, 10);
        assertEquals(20, warrior.getStrength());

}
    
}
