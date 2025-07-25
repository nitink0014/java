package nitin;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fileHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numerator First and Denominator:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();


        try{
            int res = n1/n2;
            System.out.println("Result is :" + res);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by Zero Please enter valid Numbers");
        }
        finally{
            System.out.println("Finally block is execcuted" +
                    "");
        }

    }




}
