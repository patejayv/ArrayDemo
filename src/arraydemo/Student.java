package arraydemo;

public class Student {
    
    //added firsst comment
    private String studentName;
    private String studentID;
    
    //ADDED COMMENT FOR FETCH AND MERGE
    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    //ADDED COMMENT FOR FETCH AND MERGE 2ND TIME AGAIN
    
    public String getStudentName() {
        return studentName;
    }
    
    //ADDED COMMENT FOR PULL
    
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
