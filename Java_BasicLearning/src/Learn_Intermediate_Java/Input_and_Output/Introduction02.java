package Learn_Intermediate_Java.Input_and_Output;

import java.util.Scanner;

public class Introduction02 {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        // Add code below:
        String userName = input.next();
        System.out.printf("Hello %s! It's nice to meet you.",userName);
    }
}

