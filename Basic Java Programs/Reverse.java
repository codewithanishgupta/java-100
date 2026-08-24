// 12 Write a program to reverse a number

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.print("Enter the given number : ");
        int n = new Scanner(System.in).nextInt();

        int rev = 0;
        int rem = 0;

        for (int i = n; i > 0; i = i / 10) {
            rem = i % 10;
            rev = (rev * 10) + rem;
        }
        System.out.println("After Reverse number is : " + rev);
    }
}
