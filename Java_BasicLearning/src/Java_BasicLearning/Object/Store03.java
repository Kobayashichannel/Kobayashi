package Java_BasicLearning.Object;

public class Store03 {
    // instance fields
    String productType;

    // constructor method
    public Store03(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        Store03 cookieShop = new Store03(cookie);
        cookieShop.advertise();

    }

}
