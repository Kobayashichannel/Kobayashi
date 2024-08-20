package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Bus05<T extends SchoolPerson05> {
    private T rider;

    public Bus05(T rider) {
        this.rider = rider;
    }

    public void setRider(T rider) {
        this.rider = rider;
    }

    public T getRider() {
        return this.rider;
    }

    public void printRider() {
        System.out.println(rider.toString());
    }
}
