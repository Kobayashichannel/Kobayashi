package Java_BasicLearning.Conditionals_and_Control_Flow;

public class Order05 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order05(boolean filled, double cost, String shippingMethod) {
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
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order05 book = new Order05(true, 9.99, "Express");
        Order05 chemistrySet = new Order05(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
