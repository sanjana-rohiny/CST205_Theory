
// Association: 
// Represents a general relationship where objects are associated 
// but do not have a whole-part dependency. 
// Both objects can exist independently
// There is no whole - part relationship
// This is one to one - Association
// can have i to many also.

package class_diagram;

class Teacher {
    private String name;
    // Association: Teacher is associated with a Classroom
    private Classroom classroom; 

    public Teacher(String name, Classroom classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public void getDetails() {
    	System.out.println("Teacher Name = " + this.name);
    	System.out.println("Classroom  = " + classroom.getRoomNumber());
    }
}

class Classroom {
    private String roomNumber;

    public Classroom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
   
}

public class AssociationTester {
	
	public static void main(String[] args) {
		Classroom classroom = new Classroom("S12");
		Teacher teacher = new Teacher("Alice John", classroom);		
		System.out.println("Classroom detais : " );
		teacher.getDetails();
	}
}
