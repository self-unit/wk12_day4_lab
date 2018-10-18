import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Weapon weapon;
    @Before
    public void before(){
        weapon = new Weapon("Sword", 10);
        dwarf = new Dwarf("Sneezy", 50, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Sneezy", dwarf.getName());
    }    @Test
    public void hasHealth(){
        assertEquals(50, dwarf.getHealth());
    }
    public void hasWeapon(){
        assertEquals("Sword", dwarf.getWeapon().getName());
    }
}