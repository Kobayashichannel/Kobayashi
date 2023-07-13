package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Main02 {
    public static void main(String[] args) {
        int myNumber = 24;
        String bookName = "Hello Book!";
        // Enter your code below...

        Retriever<Integer> containerRetriever = new Container02<>(myNumber);
        Retriever<String> bookRetriever = new Book02(bookName);

        System.out.println("Container retrieved data: "+ containerRetriever.retrieveData());
        System.out.println("Book retrieved data: " + bookRetriever.retrieveData());


    }
}
