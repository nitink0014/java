import java.util.Scanner;

public class SecondLargest {

    static int FindMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int secondLargest(int arr[]){

        int max =FindMax(arr);
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=FindMax(arr);
                return  secondMax;
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
        System.out.println("Second largest element is "+secondLargest(arr));
    }
}
