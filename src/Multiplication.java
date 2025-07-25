import java.util.Scanner;

public class Multiplication {
    static void PrintArray(int[][] arr ) {
        for(int i = 0; i< arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void MultiplyOfMatrices(int[][] a,int r1,int c1, int[][] b, int r2,int c2){
        if(c1!=r2){
            System.out.println("Invalid Input");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i =0 ; i<r1; i++){
            for(int j =0;j<c2;j++){
                for(int k =0; k<c1; k++)
                {
                    mul[i][j]+= a[i][k]*b[k][j];
                }
            }

        }
        PrintArray(mul);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r1;
        int c1;

        System.out.println("Enter Row and columns of A matrix :");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int [][] a = new int[r1][c1];
        System.out.println("Enter the Elements in A Matrix :");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1 ; j++){

                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Row and columns of B Matrix :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter the Elements in B Matrix :");
        for(int i =0 ; i<r2; i++){
            for( int j = 0; j<c2; j++){
                b[i][j]= sc.nextInt();

            }

        }
        MultiplyOfMatrices(a,r1,c1,b,r2,c2);
    }
}
