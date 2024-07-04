package Question9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Question9 {
	
	
	public static void countFunction_method1(String filename) {
		int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                charCount += line.length();
                wordCount += line.split("\\s+").length;
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
	}
	
	static int findWordCount(String str) {
		StringTokenizer sToc  = new StringTokenizer(str);
		return sToc.countTokens();
	}
	
	
	public static void countFunction_method2(String filename) {
		int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                charCount += line.length();
                wordCount += findWordCount(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
	}
	
	
	public static void main(String[] args) {
        String filename = "input.txt"; 
        countFunction_method1(filename);

        countFunction_method2(filename);
        
    }
}


