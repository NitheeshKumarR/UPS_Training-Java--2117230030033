import java.util.Scanner;
public class task17 {
    public static int fact(int num){
        if (num<2){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+(fact(n)));
    }
}