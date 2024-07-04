import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("serialized_object.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            // Read and deserialize the object from the file
            Person person = (Person) objectInputStream.readObject();

            // Display the deserialized object
            System.out.println("Deserialized Person: " + person.getName() + ", " + person.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    // Constructor, getters, and setters (not shown for brevity)

    // ...
}

