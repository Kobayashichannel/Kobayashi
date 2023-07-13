package Learn_Intermediate_Java.Generics_and_Collections.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main02 {
    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(27);
        sortedSet.add(7);
        sortedSet.add(7);
        for (Integer element : sortedSet) {
            System.out.println(element);
        }

    }
}
