import java.sql.SQLOutput;
import java.util.Scanner;
public class ZerosOne {

    static void swap(int arr[],int l,int r){
        int temp;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;


    }

    static void ZeroAndOne(int arr[]){
        int n=arr.length;
        int l=0;
        int r = n-1;
        while(l<r){
            if((arr[l]==1) && (arr[r]==0)){
                swap(arr,l,r);
                l++;
                r--;
            }
            if(arr[l]==0){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }
    }
    static void PrintArray(int arr[]){

        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of an Array :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        ZeroAndOne(arr);
        PrintArray(arr);


    }
}
