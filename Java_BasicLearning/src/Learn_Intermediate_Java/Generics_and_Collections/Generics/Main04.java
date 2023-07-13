package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Main04 {
    public static void main(String[] args) {
        Container04<Integer, Double> myContainer = new Container04<>(2, 45.98);

        System.out.println("Item1: "+ myContainer.getItem1());
        System.out.println("Item2: "+ myContainer.getItem2());
    }
}
