// 5 Reverse an array.

public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 6, 8, 4 };

        System.out.println("Original array");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("After Reverse Array Element");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
