// 8 Search an element using linear search.

public class Q8 {
    public static void main(String[] args) {
        int arr[] = { 55, 56, 34, 213, 78, 564 };

        int key = 34;

        System.out.println("Original Array element");

        for (int n : arr) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("\n Element is found at position(index) : " + i);
                break;
            }
        }  
    }
}
