import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Weapon weapon;
    @Before
    public void before(){
        weapon = new Weapon("Sword", 10);
        knight = new Knight("Dark Knight", 50, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Dark Knight", knight.getName());
    }    @Test
    public void hasHealth(){
        assertEquals(50, knight.getHealth());
    }
    public void hasWeapon(){
        assertEquals("Sword", knight.getWeapon().getName());
    }
}
