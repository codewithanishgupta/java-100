// 3 Write a program to swap two numbers (with temporary variable).

public class SwapNumberWithVariable {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;

        System.out.println("Before Swap X : " + x + " , Y : " + y);

        int temp = 0;

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap X : " + x + " , Y : " + y);

    }
}
