package Learn_Advanced_Java.Parallel_and_Concurrent_Programming;

import java.util.*;
import java.util.stream.*;

public class Main03 {
    public static void main(String args[]) {
        // create a list of integers
        List<Integer> number = Arrays.asList(1,2,3,4);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Squares: " + square);

        // create a list of String
        List<String> names = Arrays.asList("Omega","Alpha","Beta");

        // demonstration of filter method
        List<String> find = names.stream().filter(s->s.startsWith("O")).collect(Collectors.toList());
        System.out.println("Name starts with O: " + find);

        // demonstration of sorted method
        List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted names: " + sorted);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,1,2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("Square set: " + squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println("  intermediate square: " + y));

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println("Reduce evens: " + even);
    }
}