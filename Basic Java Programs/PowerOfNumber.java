// 15 Write a program to calculate power of a number.

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int b = sc.nextInt();

        System.out.print("Enter power : ");
        int p = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= p; i++) {
            result = result * b;
        }

        System.out.println("Result is : " + result);
    }
}
