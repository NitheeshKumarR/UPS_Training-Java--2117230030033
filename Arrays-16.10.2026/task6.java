import java.util.Scanner;
import java.util.Arrays;
class task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        int newarr[]=Arrays.copyOf(arr,n);
        System.out.println("Copied array:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
        System.out.print("]");
    }
}