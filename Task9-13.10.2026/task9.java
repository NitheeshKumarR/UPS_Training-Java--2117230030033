import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter operation +,-,*,/: ");
        char op=sc.nextLine().charAt(0);
        switch (op){
            case '+':
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;
            case '-':
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            case '*':
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            case '/':
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                break;
            default:
                System.out.println("Enter a valid symbol mentioned.");
        }
    }
}