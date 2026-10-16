import java.util.Scanner;
class task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        System.out.print("Sum of array: ");
        int tot=arr[0];
        for (int i=1;i<n;i++){
            tot+=arr[i];
        }
        System.out.print(tot);
        
    }
}