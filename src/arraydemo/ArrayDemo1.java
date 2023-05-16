package arraydemo;

import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word:");
        String word = sc.next();
        char[] wordLetters = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            
            wordLetters[i] = word.charAt(i);
        }
        
        for (int i = word.length() - 1 ; i >= 0; i--) {
            System.out.println(wordLetters[i]);
        }
    }
}
