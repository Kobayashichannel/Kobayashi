package Java_BasicLearning.Conditionals_and_Control_Flow;

public class Order03 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order03(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            return 1.75;
        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order03 book = new Order03(true, 9.99, "Express");
        Order03 chemistrySet = new Order03(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
