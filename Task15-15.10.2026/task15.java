import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number of fibonacci terms");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        if (n==1) {
            System.exit(0);
        }
        System.out.println(b);
        if (n==2){
            System.exit(0);
        }   
        int t=2;
        while (t<n){
            System.out.println(a+b);
            b=a+b;
            a=b-a;
            t+=1;
        }
    }
}