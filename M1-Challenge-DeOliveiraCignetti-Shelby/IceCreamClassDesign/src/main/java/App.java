public class App {
    public static void main(String[] args) {
        System.out.println("Welcome To Mimikyu's Ice Cream Shoppe!! ");
        IceCreamShop iceCream1 = new IceCreamShop();
        System.out.println(iceCream1.iceCream());

        System.out.println("Welcome to Definitely not A Ice Cream Factory");
        IceCreamFactory iceCream2 = new IceCreamFactory();
        System.out.println(iceCream2.composition());
        System.out.println(iceCream2.price());
    }
}
