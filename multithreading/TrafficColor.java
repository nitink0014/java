package multithreading;

public enum TrafficColor {

    RED (4000),
    YELLOW (3000),
    GREEN(2500) ;

   public int ontimeMilis;

    TrafficColor(int ontimeMilis) {
        this.ontimeMilis = ontimeMilis;
    }
}
