package arraydemo;

public class Student {
    
    //added firsst comment
    //added comment for revert
    private String studentName;
    private String studentID;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
}
