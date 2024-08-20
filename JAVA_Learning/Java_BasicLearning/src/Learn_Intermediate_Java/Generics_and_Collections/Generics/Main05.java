package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Main05 {
    public static void main(String[] args) {
        SchoolPerson05 person = new SchoolPerson05("Peter");
        Bus05<SchoolPerson05> busWPerson = new Bus05<>(person);
        busWPerson.printRider();
    }
}
