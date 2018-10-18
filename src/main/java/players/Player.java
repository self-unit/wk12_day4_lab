package players;

public abstract class Player {
    private String name;
    private int health;
    private int coins;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        this.coins = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void addHealth(int health) {
        this.health += health;
    }

    public int getCoins() {
        return coins;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }
}
