import java.util.Scanner;

public class Sum {
    static int Summ(int n){

        if(n==0)
            return 0;
        return Summ(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");


        int ans= Summ(5);
        System.out.println(ans);
    }
}
