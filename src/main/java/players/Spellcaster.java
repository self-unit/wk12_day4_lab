package players;
import items.Spell;
import behaviours.IAction;

public abstract class Spellcaster extends Player implements IAction {

    private Spell spell;

    public Spellcaster(String name, int health, Spell spell){
        super(name, health);
        this.spell = spell;
    }

    public void action(IAction actor) {

    }
}
