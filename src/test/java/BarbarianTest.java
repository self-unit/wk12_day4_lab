import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weapon;
    @Before
    public void before(){
        weapon = new Weapon("Sword", 20);
        barbarian = new Barbarian("Conan", 50, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }    @Test
    public void hasHealth(){
        assertEquals(50, barbarian.getHealth());
    }
    public void hasWeapon(){
        assertEquals(20, barbarian.getWeapon().getDamage());
    }
}