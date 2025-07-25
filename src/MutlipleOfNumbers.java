import java.util.Scanner;

public class MutlipleOfNumbers {

    static void multiple(int n , int k){
if(k==1){
    System.out.print(n+" ");
    return ;
}
multiple(n,k-1);
System.out.print(n*k +" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        multiple(n,k);

    }
}
