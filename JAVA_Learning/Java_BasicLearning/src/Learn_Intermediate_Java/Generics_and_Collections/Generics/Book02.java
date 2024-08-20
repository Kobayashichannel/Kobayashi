package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Book02 implements Retriever<String> {
    private String name;

    public Book02(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String retrieveData(){
        return this.name;
    }
}
