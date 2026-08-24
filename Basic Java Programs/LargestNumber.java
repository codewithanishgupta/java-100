// 5 Write a program to find the largest of three numbers.

public class LargestNumber {
    public static void main(String[] args) {
        int x = 23;
        int y = 34;
        int z = 22;
        int max = 0;
        if (x > y)
            if (x > z)
                max = x;
            else
                max = z;
        else if (y > z)
            max = y;
        else
            max = z;

        System.out.println("Maximum Number is : " + max);
    }
}
