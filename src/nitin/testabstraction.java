package nitin;

public class testabstraction {
    public static void main(String[] args) {
        Square s = new Square(7);
        System.out.println( s.CalculateArea());
        Circle cr = new Circle(4);
        System.out.println(cr.CalculateArea());
    }
}
