package arraydemo;

public class ArrayDemo {

    public static void main(String[] args) {
        
        char[] myLetters = new char[3];
        myLetters[0] = 'J';
        myLetters[1] = 'A';
        myLetters[2] = 'Y';
        
        for (int i = 0; i < myLetters.length; i++) {
            System.out.println(myLetters[i]);
        }
    }
    
}
