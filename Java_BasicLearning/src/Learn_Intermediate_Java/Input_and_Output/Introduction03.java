package Learn_Intermediate_Java.Input_and_Output;

import java.io.IOException;
import java.io.FileReader;

public class Introduction03 {
    public static void main(String[] args) throws IOException {
        String path = "./input.txt";
        FileReader fr = new FileReader(path);
        int counter = 0;
        while((counter = fr.read()) != -1) {
            System.out.print((char)counter);
        }
        fr.close();
    }
}
