import java.util.Scanner;
import java.util.Arrays;
class task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        System.out.println("Printing array using toString method: ");
        System.out.println(Arrays.toString(arr));
        
    }
}