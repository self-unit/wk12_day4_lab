package actions;

public abstract class Damage {
    private String name;
    private int damage;

    public Damage(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

