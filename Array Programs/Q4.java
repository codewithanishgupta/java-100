// 4 Calculate average of array elements.

public class Q4 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 6, 8, 4 };
        int total=0;
        for (int n : arr) {
            total+=n;
        }

        float avarage = (float)total/arr.length;

        System.out.println("Avarage of Array Element : "+avarage);
    }
}
