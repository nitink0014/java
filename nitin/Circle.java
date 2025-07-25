package nitin;

public class Circle extends Shape{
    public double radius;
    final double PI =3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double CalculateArea(){

        double area = PI*(radius*radius);
        return area;
    }

}
