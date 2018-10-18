import items.Spell;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Spell spell;

    @Before
    public void before(){
        warlock = new Warlock("Waz", 90, spell);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, warlock.getSpell());
    }

    @Test
    public void hasName(){
        assertEquals("Waz", warlock.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(90, warlock.getHealth());
    }

    @Test
    public void hasCoins(){
        assertEquals(0, warlock.getCoins());
    }
}