package players;

import behaviours.IAction;
import items.Spell;

public class Warlock extends Spellcaster implements IAction {
    public Warlock(String name, int health, Spell spell){
        super(name, health, spell);
    }
}