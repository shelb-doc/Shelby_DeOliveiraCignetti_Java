public class App {

    public static void main(String[] args) {

        Farmer newVillager2 = new Farmer("newVillager2", 75, 100, 75, 10, 1);
        System.out.println(newVillager2.heal());

        Constable newVillager1 = new Constable("newVillager1",75,100,75,10,1, "Active");
        System.out.println(newVillager1.attack());

        Warrior newVillager3 = new Warrior("newVillager3", 75, 100, 100, 50, 10, 100);

        System.out.println(newVillager2);

        System.out.println(newVillager3.decreaseShieldStrength());

        System.out.println(newVillager1.arrest());
    }
}