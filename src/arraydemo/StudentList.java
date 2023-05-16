package arraydemo;

public class StudentList {

    public static void main(String[] args) {
        
        Student ob = new Student("Jay", "901677098");
        
        Student[] stdntList = new Student[3];
        stdntList[0] = ob;
        stdntList[1] = new Student("abc", "2332");
        stdntList[2] = new Student("abc", "2332");
        
        for (int i = 0; i < stdntList.length; i++) {
             
            System.out.println(stdntList[i].getStudentName());
            System.out.println(stdntList[i].getStudentID());
        }
    }
}
