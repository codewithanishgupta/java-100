// 9 Implement binary search.


public class Q9 {
    public static void main(String[] args) {
        int arr [] = {12,34,657,45,32};
        int key = 45;

        int low=0,high=arr.length-1;

        // convert sortrd order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]== key){
                System.out.println("Element found at position(index) : "+mid);
                break;
            }else if(arr[mid]<key){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
