public class Warrior extends Villager {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
    }

    public int decreaseShieldStrength() {
        shieldStrength--;
        return shieldStrength;
    }

}