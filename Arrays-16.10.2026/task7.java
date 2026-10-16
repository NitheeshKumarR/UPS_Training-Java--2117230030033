import java.util.Scanner;
import java.util.Arrays;
class task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array 1:");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for (int i=0;i<n1;i++){
            System.out.println("Enter value "+(i+1));
          arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of array 2:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for (int i=0;i<n2;i++){
            System.out.println("Enter value "+(i+1));
          arr2[i]=sc.nextInt();
        }
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
        
    }
}