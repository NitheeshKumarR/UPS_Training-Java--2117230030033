import java.util.Scanner;
class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        System.out.println("Array before reversal:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        for (int i=0;i<n/2;i++){
            arr[i]+=arr[n-i-1];
            arr[n-i-1]=arr[i]-arr[n-i-1];
            arr[i]-=arr[n-i-1];
        }
        System.out.println("Array after reversal:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}