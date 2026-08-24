// 9 Write a program to find the sum of first N natural numbers.

import java.util.Scanner;

public class SumOfNaturalNNumbar {
    public static void main(String[] args) {

        System.out.println("Enter given n number : ");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum of natural numbar is : " + sum);
    }
}
