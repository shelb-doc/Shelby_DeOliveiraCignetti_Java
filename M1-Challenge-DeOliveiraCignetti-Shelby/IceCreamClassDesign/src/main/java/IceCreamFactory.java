import java.util.Scanner;

public class IceCreamFactory {
    private double galMilk;
    private double galCream;
    private double lbSugar;
    private double priceOfMilk;
    private double priceOfCream;
    private double priceOfSugar;
    private String flavoring;

    public String composition() {
        galMilk = getGalMilk();
        galCream = getGalCream();
        lbSugar = getLbSugar();
        flavoring = getFlavoring();
        price();

        return "For this batch of ice cream " + galMilk + " gallons of milk, " + galCream + " gallons of cream, " + lbSugar + " lbs of sugar, and " + flavoring + " flavoring were used.";
    }

    public String price() {
        double totalPrice = priceOfMilk + priceOfSugar + priceOfCream;
        priceOfMilk = getPriceOfMilk();
        priceOfCream = getPriceOfCream();
        priceOfSugar = getPriceOfSugar();

        return "The price of this batch is $" + String.format("%.2f",totalPrice);
    }

    public double getGalMilk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gallons of milk used.");
        double galMilk = Integer.parseInt(scanner.nextLine());
        return galMilk;
    }

    public double getGalCream() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gallons of cream used.");
        double galCream = Integer.parseInt(scanner.nextLine());
        return galCream;
    }

    public double getLbSugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter lbs of sugar used.");
        double lbSugar = Integer.parseInt(scanner.nextLine());
        return lbSugar;
    }

    public double getPriceOfMilk() {
        double priceOfMilk = 2.69 * galMilk;
        // $2.69 is average cost of gallon of milk.
        return priceOfMilk;
    }

    public double getPriceOfCream() {
        double priceOfCream = 30.82 * galCream;
        // $30.82 is average cost of gallon of cream.
        return priceOfCream;
    }

    public double getPriceOfSugar() {
        double priceOfSugar = 61.63 * lbSugar;
        // $61.63 is average cost of lb of sugar.
        return priceOfSugar;
    }

    public String getFlavoring() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter flavoring used.");
        String flavoring = scanner.nextLine();
        return flavoring;
    }
}