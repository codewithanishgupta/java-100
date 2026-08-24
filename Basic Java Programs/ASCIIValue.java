// 20 Write a program to print ASCII value of a character.

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        
        System.out.print("Enter the given character : ");
        char ch = new Scanner(System.in).next().charAt(0);

        int ascii= (int)ch;

        System.out.println("ASCII Value of "+ch+" is : "+ascii);
    }
}
