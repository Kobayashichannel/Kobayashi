package Learn_Intermediate_Java.Serialization;

/* Computer.java */
import javax.management.monitor.Monitor;
import java.io.*;

public class Computer implements Serializable {
    private static final long serialVersionUID = 1L;
    Keyboard keyboard;
    Monitor monitor;

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.keyboard = new Keyboard();
        computer.monitor = new Monitor() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("computerStorage.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(computer);
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        System.out.println("Everything is good here! Serialization complete!");
    }

    private static class Keyboard {
    }
}


