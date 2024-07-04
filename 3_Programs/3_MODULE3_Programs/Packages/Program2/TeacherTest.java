
import college.staff.cbse.*; // Import the CBSE Teacher class
import college.staff.icse.*; // Import the ICSE Teacher class

public class TeacherTest {

    public void testCBSETeacher() {
        college.staff.cbse.Teacher cbseTeacher = 
        	new college.staff.cbse.Teacher("Alice", "Math", 10);

        cbseTeacher.teach();
        cbseTeacher.getExperienceYears();        
        cbseTeacher.conductCBSEExam();
        
        
    }

    public void testICSETeacher() {
        college.staff.icse.Teacher icseTeacher = 
        	new college.staff.icse.Teacher("Bob", "Science", "Biology");

        icseTeacher.teach();
        icseTeacher.getSpecialization();
        icseTeacher.conductICSEExam();

    }
    
    public static void main(String[] args) {
    
        TeacherTest t = new TeacherTest();
    	t.testCBSETeacher();
    	System.out.println("\n============================");
    	t.testICSETeacher();	
    	System.out.println("\n============================");
    }
}

