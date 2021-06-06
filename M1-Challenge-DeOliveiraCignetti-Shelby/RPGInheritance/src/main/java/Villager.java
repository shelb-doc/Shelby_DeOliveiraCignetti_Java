public class Villager {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public void villager(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    // Abilities
    public int decreaseHealth() {
        health--;
        return health;
    }
    public int increaseStamina() {
        stamina++;
        return stamina;
    }
    public int decreaseStamina() {
        stamina--;
        return stamina;
    }
    public int run() {
        speed++;
        return speed;
    }
    public int attack() {
        health--;
        return health;
    }

}