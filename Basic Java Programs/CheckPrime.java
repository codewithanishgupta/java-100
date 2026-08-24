// 10 Write a program to check prime number.

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        System.out.print("Enter the given number : ");
        int n = new Scanner(System.in).nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Given number is a prime numaber.");
        else
            System.out.println("Given number is not a prime number.");
    }
}
