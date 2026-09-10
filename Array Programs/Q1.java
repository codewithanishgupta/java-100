// 1 Find the largest element in an array.

public class Q1 {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 67, 89, 44 };
        int largest = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("Largest element is : " + largest);
    }
}