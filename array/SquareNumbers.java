import java.util.Scanner;

public class SquareNumbers {


    static void PrintArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] SquareOfNumbers(int arr[]) {

        int n = arr.length;
        int ans[] = new int[n];
        int k = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;

            }

        }
        return ans;
    }
        public static void main (String[] args){
            int n;
            System.out.println("Enter the size of an Array :");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements in array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           int[] ans= SquareOfNumbers(arr);
            PrintArray(ans);
        }

    }

