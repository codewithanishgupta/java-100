// 3 Print an inverted pyramid pattern.

public class Q3 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
