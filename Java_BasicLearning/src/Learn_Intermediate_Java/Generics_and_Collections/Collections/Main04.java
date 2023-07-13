package Learn_Intermediate_Java.Generics_and_Collections.Collections;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
public class Main04 {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(9);
        myInts.add(13);
        myInts.add(2);
        myInts.add(1);
        myInts.add(11);
        myInts.add(39);
        myInts.add(78);
        myInts.add(4);

        Deque<Integer> result = separateInts(myInts);
        for(Integer i: result) {
            System.out.println(i);
        }
    }

    // add your code here to complete separateInts()
    public static Deque<Integer> separateInts(List<Integer> integers){
        Deque<Integer> separatedDeque = new ArrayDeque<>();
        for (Integer myInts: integers) {
            if (myInts % 2 == 0) {
                separatedDeque.addFirst(myInts);
            } else {
                separatedDeque.addLast(myInts);
            }
        }
        return separatedDeque;
    }
}
