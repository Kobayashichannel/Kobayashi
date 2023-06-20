package Java_BasicLearning.Object;

public class Store06 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store06(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    // get price with tax method

    // main method
    public static void main(String[] args) {
        //Store06 increasePrice = new Store06("Lemonade", 3.75);
        Store06 lemonadeStand = new Store06("Lemonade", 3.75);
        lemonadeStand.getPriceWithTax();
        System.out.println(lemonadeStand);

    }
}
