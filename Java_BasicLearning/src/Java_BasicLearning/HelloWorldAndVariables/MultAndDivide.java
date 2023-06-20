package Java_BasicLearning.HelloWorldAndVariables;

public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double subtotalTax = subtotal * tax;
        double totalSubtotal = subtotalTax + subtotal;
        System.out.println(totalSubtotal);

        int perPerson = 4;
        double averageCost = totalSubtotal / perPerson;
        System.out.println(averageCost);
    }
}