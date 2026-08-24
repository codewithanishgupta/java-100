// 6 Write a program to check even or odd number

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the given number : ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("The given number is Even.");
        else
            System.out.println("The given number is Odd.");
    }
}
