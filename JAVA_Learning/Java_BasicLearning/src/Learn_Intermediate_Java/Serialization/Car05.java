package Learn_Intermediate_Java.Serialization;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car05 implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;
    private Engine engine;

    public Car05(String make, int year) {
        this.make = make;
        this.year = year;

    }

    public String toString() {
        return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car05 toyota = new Car05("Toyota", 2021);
        Car05 honda = new Car05("Honda", 2020);
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car05 toyotaCopy = (Car05) objectInputStream.readObject();
        Car05 hondaCopy = (Car05) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - " + toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);
    }
}



