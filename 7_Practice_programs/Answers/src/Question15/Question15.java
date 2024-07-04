package Question15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question15 {

	public static final int A_grade = 90;
	public static final int B_grade = 80;
	public static final int C_grade = 70;
	public static final int D_grade  = 60;

	static void createBinaryFile() throws IOException {
		
		File f1 = new File("scores.bin");
		if (f1.exists() == false) {
			f1.createNewFile();
		}
		//int 0000002 00000058 00000075
		FileOutputStream fos = new FileOutputStream(f1);
		DataOutputStream dout = new DataOutputStream(fos);

        dout.writeInt(2);
        dout.writeInt(58);
        dout.writeInt(75);
        dout.close();
        fos.close();
	}
	
	static String findGrade(int score) {
		 // Calculate the grade based on the university exam standard
        String grade;
        if (score >= A_grade) {
            grade = "A";
        } else if (score >= B_grade) {
            grade = "B";
        } else if (score >= C_grade) {
            grade = "C";
        } else if (score >= D_grade) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
	}
	
	static void readBinaryFile() throws IOException {
	
		File f1 = new File("scores.bin");
		if (f1.exists() == false) {
			System.out.println("File Missing...!");
		}
		
		FileInputStream fis = new FileInputStream(f1);
		DataInputStream din = new DataInputStream(fis);

        int countOfStudent = din.readInt();
		System.out.println("countOfStudent = " + countOfStudent);
		
		int mark = 0;
		String grade;
		for (int i=0; i<countOfStudent; i++) {
			mark = din.readInt();
			grade = findGrade(mark);
			System.out.println("mark = " + mark + " Grade = " + grade);
		}
	}
	
	public static void main(String args[]) {
		
		try {
			createBinaryFile();
			readBinaryFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
