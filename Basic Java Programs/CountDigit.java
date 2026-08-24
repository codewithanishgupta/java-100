// 14 Write a program to count digits in a number.

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        System.out.print("Enter the given number is : ");
        int n = new Scanner(System.in).nextInt();

        int count = 0;

        for (int i = n; i > 0; i = i / 10) {
            count++;
        }

        System.out.println("digit of given number is : " + count);
    }
}
