package Learn_Intermediate_Java.Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car02 implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car02(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Car02 Toyota = new Car02("Toyota", 2021);
        Car02 Honda = new Car02("Honda", 2020);

        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(Toyota);
        objectOutputStream.writeObject(Honda);
    }
}
