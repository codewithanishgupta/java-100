// 16 Write a program to check Armstrong number.

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.print("Enter the given number is : ");
        int n = new Scanner(System.in).nextInt();

        int rem = 0;
        int arm = 0;

        for (int i = n; i > 0; i = i / 10) {
            rem = i % 10;
            arm = arm + (rem * rem * rem);
        }

        if (arm == n) {
            System.out.println("The given numver is armstrong number.");
        } else {
            System.out.println("The given number is not a armstrong number.");
        }
    }
}
