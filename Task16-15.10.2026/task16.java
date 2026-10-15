import java.util.Scanner;
import java.lang.Math;
public class task16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        if (sb.toString().equals(sb.reverse().toString())){
            System.out.println("It is a palindrome");
        }
        else{
        System.out.println("It's not a palindrome");
        }
    }
}