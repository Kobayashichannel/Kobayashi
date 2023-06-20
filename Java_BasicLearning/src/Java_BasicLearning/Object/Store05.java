package Java_BasicLearning.Object;

public class Store05 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store05(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println(price);
    }

    // main method
    public static void main(String[] args) {
        Store05 lemonadeStand = new Store05("Lemonade", 3.75);

    }
}
