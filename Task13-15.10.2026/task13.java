import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;
        int l=(n+"").length();
        int res=0;
        while(n>0){
            res+=Math.pow(n%10,l);
            n/=10;
        }
        System.out.println((num==res)?"It's an Armstrong number":"It's not an Armstrong number");
    }
}