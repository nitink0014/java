package nitin;

public class car {
     public String Name;
     public String Model;
     private int Speed;

public car(){

}

    public car(String name, String model, int speed) {
        Name = name;
        Model = model;
        Speed = speed;
    }

    @Override
    public String toString() {
        return "car{" +
                "Name='" + Name + '\'' +
                ", Model='" + Model + '\'' +
                ", Speed=" + Speed +
                '}';
    }

    public static void main(String[] args) {

    }
}
