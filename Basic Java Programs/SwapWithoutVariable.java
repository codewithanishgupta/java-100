// 4 Write a program to swap two numbers without temporary variable.

public class SwapWithoutVariable {
    public static void main(String[] args) {

        int a = 56;
        int b = 76;

        System.out.println("Before Swap A : " + a + " , B : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap A : " + a + " , B : " + b);
    }
}
