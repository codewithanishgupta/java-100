// 3 Calculate sum of array elements.

public class Q3 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 6, 8, 4 };
        int sum=0;
        for (int n : arr) {
            sum+=n;
        }
        System.out.println("Sum of array element : " + sum);
    }
}
