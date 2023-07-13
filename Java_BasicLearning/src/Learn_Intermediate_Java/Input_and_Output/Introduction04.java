package Learn_Intermediate_Java.Input_and_Output;

import java.io.FileWriter;
import java.io.IOException;

public class Introduction04 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        String outputText = "We love learning to code with Codecademy.";
        writer.write(outputText);
        System.out.println(outputText);
        writer.close();
    }
}
