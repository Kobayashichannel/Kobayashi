package Learn_Intermediate_Java.Generics_and_Collections.Collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Main03 {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        line.add("Mike");
        line.add("Isabel");
        line.add("Jenny");
        line.add("Kobayoshi");
        line.add("Miku");

        for(String name: line) {
            System.out.println(name);
        }
        processAlphabetically(line);
    }
        public static void processAlphabetically(Queue<String> queue) {
            PriorityQueue<String> alphabeticalQueue = new PriorityQueue<>();

            for (String name : queue) {
                alphabeticalQueue.offer(name);
            }
            while(alphabeticalQueue.peek() != null) {
                String headElement = alphabeticalQueue.remove();
                System.out.println("Processing: "+ headElement);
            }
        }
}
