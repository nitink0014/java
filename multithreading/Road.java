package multithreading;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight t1 = new TrafficLight(TrafficColor.RED);
        TrafficLight t2 = new TrafficLight(TrafficColor.YELLOW);
        TrafficLight t3 = new TrafficLight(TrafficColor.GREEN);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
