public class Farmer extends Villager {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    //  - Abilities
    //  - plow
    String plow() {
        return "Plowed the farm";
    }

    //    - Harvest
    String harvest() {
        return "Farmer harvested the Farm!";
    }
    //    - Heal
    public int heal() {
        health++;
        return health;
    }

}
