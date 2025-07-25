import java.util.Scanner;

public class UniqueNumber {
    static int Unique(int arr[]){
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            ans=arr[i]   ;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i=0; i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println(Unique(arr));
    }
}
