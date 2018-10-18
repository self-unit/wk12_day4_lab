import Rooms.Enemy;
import Rooms.Room;
import Rooms.Treasure;
import behaviours.IAction;
import items.Spell;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Player;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    Room room2;
    ArrayList<IAction> actors;
    Dwarf player1;
    Wizard player2;
    Enemy enemy;
    Weapon sword;
    Spell fireball;
    Treasure gold;

    @Before
    public void before(){
        gold = new Treasure("gold", 100);
        sword = new Weapon("sword", 50);
        fireball = new Spell("fireball", 80);
        player1 = new Dwarf("Grendle", 150, sword);
        player2 = new Wizard("Gandalf", 100, fireball);
        enemy = new Enemy("Troll", 100, sword);
        actors = new ArrayList<IAction>(player1, player2, enemy);
        room1 = new Room(actors);
        room2 = new Room(actors, gold);
    }

    @Test
    public void hasActors(){
        assertEquals(3, room1.getActors());
    }
}
