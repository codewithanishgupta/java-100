// 17 Write a program to print Fibonacci series.

import java.util.Scanner;

public class Fibonacciserie {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 1;

        System.out.print("Enter the range to find fibonacciSeries : ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Series is : ");
        System.out.print(x+" ");
        for (int i = 1; i <= n; i++) {
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}
