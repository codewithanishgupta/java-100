// 18 Write a program to find LCM of two numbers.

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();

        int max = (x > y) ? x : y;

        while (true) {
            if (max % x == 0 && max % y == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}
