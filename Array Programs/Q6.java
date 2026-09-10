// 6 Sort array elements in ascending order.

public class Q6 {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 32, 56, 34 };

        System.out.print("Original Array Element : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n After sorting (ascending) Array element is :");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
