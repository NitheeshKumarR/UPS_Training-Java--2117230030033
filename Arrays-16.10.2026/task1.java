import java.util.Scanner;
class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        int mini;
        for (int i=0;i<n-1;i++){
            mini=i;
            for(int j=i+1;j<n;j++){
                if (arr[j]<arr[i]){
                    mini=j;
                }
            }
            if (i!=mini){
                arr[i]+=arr[mini];
                arr[mini]=arr[i]-arr[mini];
                arr[i]-=arr[mini];
            }
        }
        System.out.println("Array after sorting:");
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}