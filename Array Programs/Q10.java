// 10 Copy one array to another.

public class Q10 {
    public static void main(String[] args) {
        int arr1[] = {12,3,34,34,45};
        int arr2[] = new int[arr1.length];

        for(int i = 0 ; i<arr1.length ; i++){
            arr2[i]=arr1[i];
        }

        System.out.println("Original array element : ");
        for(int n : arr1){
            System.out.print(n+" ");
        }

        System.out.println("\nCopy array element : ");
        for(int n : arr2){
            System.out.print(n+" ");
        }
    }
}
