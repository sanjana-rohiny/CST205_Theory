package college.staff.cbse;

public class Teacher {
    private String name;
    private String subject;
    private int experienceYears; // Added attribute for CBSE department

    public Teacher(String name, String subject, int experienceYears) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
        
        System.out.println("CBSE Teacher Class");
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + " in the CBSE department.");
    }

    public void conductCBSEExam() {
        System.out.println(name + " is preparing students for the CBSE exams.");
    }
    
    public int getExperienceYears() {
        return experienceYears;
    }
}

