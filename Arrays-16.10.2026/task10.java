import java.util.Scanner;
import java.util.Arrays;
class task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students:");
        int n=sc.nextInt();
        int a;
        int[][] stu=new int[n][];
        for (int i=0;i<n;i++){
            System.out.println("Enter no of subjects for student "+(i+1)+": ");
          a=sc.nextInt();
        stu[i]= new int[a];
            for (int j=0;j<a;j++){
                System.out.println("Enter marks for subject "+(j+1));
                stu[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            System.out.print("Total Marks of student "+(i+1)+" is: ");
            int sum=0;
            for (int j=0;j<stu[i].length;j++){
                sum+=stu[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
    sc.close();
    }
}