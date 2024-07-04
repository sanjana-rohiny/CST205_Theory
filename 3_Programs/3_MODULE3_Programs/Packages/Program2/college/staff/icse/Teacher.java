package college.staff.icse;

public class Teacher {
    private String name;
    private String subject;
    private String specialization; // Added attribute for ICSE department

    public Teacher(String name, String subject, String specialization) {
        this.name = name;
        this.subject = subject;
        this.specialization = specialization;
        
        System.out.println("ICSE Teacher Class");
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + " in the ICSE department.");
    }

    public void conductICSEExam() {
        System.out.println(name + " is preparing students for the ICSE exams.");
    }
    
    public String getSpecialization() {
        return specialization;
    }
}

