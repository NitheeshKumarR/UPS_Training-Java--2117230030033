import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks= sc.nextInt();
        if (marks<30){
            System.out.println("You got C grade");
        }
        else if (marks>=30 && marks<50){
            System.out.println("You got B grade");
        }
        else if (marks>=50 && marks<80){
            System.out.println("You got A grade");
        }
        else{
            System.out.println("You got S grade");
        }
    }
}