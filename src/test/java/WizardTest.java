import items.Spell;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard harry;
    Spell spell;

    @Before
    public void before(){
        harry = new Wizard("Harry", 50, spell);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, harry.getSpell());
    }

    @Test
    public void hasName(){
        assertEquals("Harry", harry.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(50, harry.getHealth());
    }

    @Test
    public void hasCoins(){
        assertEquals(0, harry.getCoins());
    }
}