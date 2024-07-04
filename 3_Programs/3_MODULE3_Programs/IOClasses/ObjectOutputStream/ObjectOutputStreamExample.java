import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("serialized_object.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            // Create an object to serialize
            Person person = new Person("Alice", 30);

            // Serialize and write the object to the file
            objectOutputStream.writeObject(person);

            System.out.println("Object has been serialized and written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (not shown for brevity)
}

