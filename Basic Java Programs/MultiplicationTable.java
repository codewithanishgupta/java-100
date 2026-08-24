// .8 Write a program to generate multiplication table

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.print("Enter the given integer : ");
        int n = new Scanner(System.in).nextInt();

        int tab = 0;

        System.out.println("Table of " + n + " is ");

        for (int i = 1; i <= 10; i++) {
            tab = 0;
            tab = n * i;

            System.out.print(n + " * " + i + " = " + tab);
            System.out.println();
        }
    }
}
