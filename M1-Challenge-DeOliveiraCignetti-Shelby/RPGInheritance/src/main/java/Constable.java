public class Constable extends Villager {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private String jurisdiction;


    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    //  - Abilities

    //    - Arrest
    String arrest() {
        return "arrested the thief!";
    }

    //    - Heal
    public int heal() {
        health++;
        return health;
    }


}
