package players;

import behaviours.IAction;
import items.Spell;

public class Wizard extends Spellcaster implements IAction {

    public Wizard(String name, int health, Spell spell){
        super(name, health, spell);
    }
}