// 11 Write a program to print prime numbers between 1–100.

public class PrintPrimeNumber {
    public static void main(String[] args) {

        System.out.println("All prime numbers of 1-100");

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(i + " ");
        }
    }
}
