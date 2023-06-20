package Java_BasicLearning.Object;

public class Store02 {
    // instance fields
    String productType;

    // constructor method
    public Store02(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }


    // main method
    public static void main(String[] args) {
        Store02 lemonadeStand = new Store02("Lemonade");
        lemonadeStand.advertise();
    }
}