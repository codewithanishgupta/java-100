// 2 Find the smallest element in an array.


public class Q2 {
    public static void main(String[] args) {
        int arr[] = { 12, 5, 67, 89, 44 };
        int smallest = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < smallest) {
                smallest = n;
            }
        }
        System.out.println("Largest element is : " + smallest);
    }
}
