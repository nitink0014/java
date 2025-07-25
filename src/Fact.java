import java.util.Scanner;


public class Fact {


    static int Fabonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fabonacci(n-1)+Fabonacci(n-2);

    }

//    static int factorial(int n){
//        if(n==0){
//            return 1;
//        }
//
//        return n*factorial(n-1);
//
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
      //  System.out.println("Factorial is :"+factorial(n));
        System.out.println("Factorial is :"+Fabonacci(n));

    }
}
