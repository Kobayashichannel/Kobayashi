package Learn_Intermediate_Java.Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car04 implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;
    private transient String model;

    public Car04(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

    public String toString(){
        return String.format("Car make is: %s, Car year is: %d, Car model is: %s, serialVersionUID: %d", this.make, this.year, this.model, serialVersionUID);

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car04 toyota = new Car04("Toyota", 2021, "Corolla");
        Car04 honda = new Car04("Honda", 2020, "Civic");
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car04 toyotaCopy = (Car04) objectInputStream.readObject();
        Car04 hondaCopy = (Car04) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - "+ toyotaCopy);
        System.out.println("Toyota (Original) - "+ toyota);
        System.out.println("Is same object: "+ isSameObject);
    }
}