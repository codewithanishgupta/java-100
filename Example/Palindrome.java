import java.util.Scanner;

public class Palindrome {
    public static void main (String arg []){
        String str = new String ();
        System.out.println("Enter the name : ");
        str=new Scanner(System.in).nextLine();
        
        String rev ="";

        for(int i = str.length()-1 ; i>=0 ; i--){
            rev = rev+ str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palinedrome");
        else
            System.out.println("Not a Palindrome");
    }
}