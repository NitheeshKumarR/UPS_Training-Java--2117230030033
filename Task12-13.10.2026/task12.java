import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your score in first interview:");
        int s1=sc.nextInt();
        if (s1>=50){
            System.out.println("Enter your score in second interview:");
            int s2=sc.nextInt();
            if (s2>=70){
                System.out.println("Enter your score in final interview:");
                int s3=sc.nextInt();
                if (s3>=90){
                    System.out.println("Congrats, you got selected.");
                }
                else{
                    System.out.println("You failed to clear the final interview.");
                }
            }
            else{
                System.out.println("You failed to clear the second interview");
            }
        }
        else{
            System.out.println("You failed to clear the first interview.");
        }
    }
}