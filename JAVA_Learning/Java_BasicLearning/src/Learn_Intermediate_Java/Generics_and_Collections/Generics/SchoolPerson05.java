package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class SchoolPerson05 {
    private String name;

    public SchoolPerson05(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "SchoolPerson (name = "+ this.name + ")";
    }
}
