package nitin;

public class Test {
    public static void main(String[] args) {
    car c = new car();
   c.Model = "Maruti";
   c.Name = "Dezire";
        System.out.println(c);

car newcar = new car("black","Suzuki",120);
        System.out.println(newcar);
        System.out.println(newcar.Model);
    }
}
