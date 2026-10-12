import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println((number%2==0)?"It is even":"It is odd");
    }
}