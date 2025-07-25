import java.util.Scanner;
public class circle {


    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius :");
        int r = sc.nextInt();
        double area = PI*r*r;
        double circumFerence= 2*PI*r;
        System.out.println("area of a circle is :"+area+" and the circumference of a circle is " +
                ":"+circumFerence);
    }
}
