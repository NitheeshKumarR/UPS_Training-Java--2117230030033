import java.util.Scanner;
import java.lang.Math;
public class task14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if (n<2){
            System.out.println("Not a prime");
        }
        else{
            if (n==2){
                System.out.println("It is a prime");
                System.exit(0);
            }
            for (int i=2;i<=((Math.pow(n,0.5))+1);i++){
                if ((n%i)==0){
                    System.out.println("Not a prime");
                    System.exit(0);
                }
            }
            System.out.println("It is a prime");
        }
    }
}