import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weapon;
    Weapon axe;

    @Before
    public void before(){
        weapon = new Weapon("Sword", 20);
        barbarian = new Barbarian("Conan", 50, weapon);
        axe = new Weapon("axe", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(50, barbarian.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(20, barbarian.getWeapon().getDamage());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }
}