package Learn_Advanced_Java.Parallel_and_Concurrent_Programming;

import java.util.Arrays;
import java.util.List;

public class Review {
    public static void main(String args[]) {
        List<String> welcome = Arrays.asList("You","did","it!");
        welcome.stream().forEach(y->System.out.println(y));
    }
}
