// 19 Write a program to find GCD of two numbers

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();

        while(y!=0){
            int temp = y ;
            y = x%y;
            x=temp;
        }
    }
}