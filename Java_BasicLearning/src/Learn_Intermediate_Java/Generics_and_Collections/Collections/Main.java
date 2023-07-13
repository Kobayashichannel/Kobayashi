package Learn_Intermediate_Java.Generics_and_Collections.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("!");
        for (String number : stringList) {
            System.out.println(number);
        }
    }
}
