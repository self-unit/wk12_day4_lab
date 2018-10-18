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

}
