package Java_BasicLearning.Object;

public class Store04 {
    // instance fields
    String productType;

    // constructor method
    public Store04(String product) {
        productType = product;
    }

    // advertise method
    public void greetCustomer(String customer, int age) {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        Store04 lemonadeStand = new Store04("Lemonade");
        lemonadeStand.greetCustomer("111");
    }
}
