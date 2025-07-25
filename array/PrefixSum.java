import java.util.Scanner;

 public class PrefixSum {

     static void PrintArray(int arr[]) {

         int n = arr.length;
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i]+" ");
         }
     }

     static int[] Prefix(int arr[]){
         int n=arr.length;
         for(int i=1;i<n;i++){
             arr[i]=arr[i]+arr[i-1];
         }
return arr;
     }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pre[] = Prefix(arr);

        System.out.println("enter the queries");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pre[r]-pre[l-1];
            System.out.println(ans);
        }

    }
}
