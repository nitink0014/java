package nitin;

public class Square extends Shape{
     public double side;

    public Square(double side) {
        this.side = side;
    }

    public double CalculateArea() {
        double sq = side *side;
        return sq;
    }
}
