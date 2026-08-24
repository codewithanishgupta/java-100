// 13 Write a program to check palindrome number.

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        System.out.print("Enter the given number : ");
        int n = new Scanner(System.in).nextInt();

        int rem = 0;
        int rev = 0;

        for (int i = n; i > 0; i = i / 10) {
            rem = i % 10;
            rev = (rev * 10) + rem;
        }

        if (rev == n)
            System.out.println("Given number is Palindrome.");
        else
            System.out.println("Given number is not a palinedrome number.");
    }
}
