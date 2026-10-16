import java.util.Scanner;
class task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1));
          arr[i]=sc.nextInt();
        }
        int eve=0;
        int odd=0;
        int pos=0;
        int neg=0;
        int prime=0;
        for (int i=1;i<n;i++){
            if (arr[i]>0){
                pos+=1;
            }
            else{
                neg+=1;
            }
            if (arr[i]%2==0){
                eve+=1;
            }
            else{
                odd+=1;
            }
            if (arr[i]<2){
                continue;
            }
            else if (arr[i]==2){
                prime+=1;
            }
            else{
                for (int j=2;j<n;j++){
                    if (arr[i]%j==0){
                        break;
                    }
                    if (j==n-1){
                        prime+=1;
                    }
            }
        }
        System.out.println("even:"+eve);
        System.out.println("Odd:"+odd);
        System.out.println("prime:"+prime);
        System.out.println("Positive:"+pos);
        System.out.println("Negative:"+neg);
    }
}
}