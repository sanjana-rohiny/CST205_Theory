package serialize;

import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Serialize the object
        try (ObjectOutputStream out = 
        		new ObjectOutputStream
        		(new FileOutputStream("student.ser"))) {
        	
            Student student = new Student(1, "Alice");
            out.writeObject(student);
            System.out.println("Student object serialized and saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = 
        		new ObjectInputStream(
        				new FileInputStream("student.ser"))) {
        	
            Student deserializedStudent = 
            		(Student) in.readObject();
            System.out.println("Deserialized Student: ID - " + deserializedStudent.getId() + ", Name - " + deserializedStudent.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Notes
/*Serialization in Java is the process of converting an 
 * object's state (i.e., its fields and data) into a 
 * byte stream. 
 * This byte stream can be easily stored in a file, 
 * sent over a network, or otherwise persisted for later use. 
 * Serialization is commonly used when you need to save 
 * an object's state, transmit it across a network,
 *  or pass it between different parts of an 
 *  application or different applications.
 * 
 * Serializable Interface: 
 * In Java, to make an object serializable, 
 * the class of that object must implement the Serializable interface.
 * This interface is a marker interface, 
 * which means it doesn't have any methods to implement. 
 * Its presence in a class tells Java that objects of this 
 * class can be serialized.
 * 
 * ObjectOutputStream: 
 * 	To serialize an object, you use an ObjectOutputStream 
 * to write the object to a stream. 
 * 
 * ObjectInputStream: 
 *    To deserialize an object (i.e., convert a byte 
 *    stream back into an object), you use an ObjectInputStream 
 *    to read the object from a stream.
 *    
 *    In the above program, "student.ser" is the name of the file 
 *    where the serialized Student object is stored. 
 *    
 *    You can use any serialized objects like network using a Socket or BLOB 
 *    and its output stream instead of FIleStream which uses .ser file (eg student.ser)
 *    
 */
