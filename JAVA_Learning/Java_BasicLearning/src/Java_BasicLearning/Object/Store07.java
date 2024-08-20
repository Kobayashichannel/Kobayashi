package Java_BasicLearning.Object;

public class Store07 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store07(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store07 lemonadeStand = new Store07("Lemonade", 3.75);
        Store07 cookieShop = new Store07("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }

    @Override
    public String toString() {
        return "Store07{" +
                "productType='" + productType + '\'' +
                ", price=" + price +
                '}';
    }
}
