public class CoffeeShop {

    static int totalCoffeeSold = 0;

    String shopName;
    
    int shopCoffeeSold;

    public CoffeeShop(String name) {
        this.shopName = name;
        this.shopCoffeeSold = 0;
    }

    public void sellCoffee(int cups) {

        double transactionTotal = cups * 3.50;

        this.shopCoffeeSold += cups;

        totalCoffeeSold += cups;

        System.out.println(shopName + " sold " + cups + " cups of coffee.");
        System.out.println("Transaction total: $" + transactionTotal);
        System.out.println("This shop has sold " + this.shopCoffeeSold + " cups in total.");
        System.out.println("All shops have sold " + totalCoffeeSold + " cups in total.");
    }

    public static void main(String[] args) {
        CoffeeShop downtown = new CoffeeShop("Downtown Cafe");
        CoffeeShop uptown = new CoffeeShop("Uptown Brews");

        downtown.sellCoffee(5);
        System.out.println();
        uptown.sellCoffee(3);
        System.out.println();
        downtown.sellCoffee(2);
    }
}
