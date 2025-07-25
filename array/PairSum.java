import java.util.Scanner;

public class PairSum {

    static int pairsum(int arr[],int target){
        int n = arr.length;
        int count=0;
        for(int i =0; i<n;i++)
        {
            for( int j=i+1; j<n; j++){
               for(int k=j+1;k<n;k++)
               {
                   if(arr[i]+arr[j]+arr[k]==target){
                       count++;
                   }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the taget value :");
        int target=sc.nextInt();
        System.out.println(pairsum(arr,target));
    }
}
