package actions;

public class Heal {

    private String name;
    private int healingValue;

    public Heal(String name, int healingValue){
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
