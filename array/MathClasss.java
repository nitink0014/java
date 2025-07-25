import java.util.Scanner;

public class MathClasss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int n = sc.nextInt();
        int sqr = (int)Math.sqrt(n);
        System.out.println("Squareroot of number is:" + sqr);

    }
}
