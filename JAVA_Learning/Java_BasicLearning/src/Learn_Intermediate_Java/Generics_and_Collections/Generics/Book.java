package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Book(name = \""
                + this.name
                + "\")";
    }
}
