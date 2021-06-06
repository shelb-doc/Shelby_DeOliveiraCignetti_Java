import java.util.Scanner;

public class IceCreamShop {
    private int numberOfScoops;
    private String flavor;
    private String containerType;
    private double price;

    public String iceCream() {
        numberOfScoops  = getNumberOfScoops();
        flavor = getFlavor();
        containerType = getContainerType();
        price = getPrice();
        return "The number of scoops is " + numberOfScoops + ", " + "the flavor is " + flavor + ", " + "the container type is a " + containerType + ", " + "and the price is " + "$" + price;
    }

    public int getNumberOfScoops() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of scoops you would like? ");
        int numberOfScoops = Integer.parseInt(scanner.nextLine());
        return numberOfScoops;
    }
    public String getFlavor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a flavor?");
        String flavor = scanner.nextLine();;
        return flavor;
    };
    public String getContainerType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a container type.");
        String containerType = scanner.nextLine();
        return containerType;
    };
    public double getPrice() {
        double price = .55 * numberOfScoops;
        return price;
    };
}