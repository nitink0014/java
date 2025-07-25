package multithreading;

public class TrafficLight extends Thread {

    private final TrafficColor color;

   public TrafficLight(TrafficColor color){
        this.color=color;
    }


    @Override
    public void run() {
        System.out.printf("%s is active\n",color );
        try {
            Thread.sleep(color.ontimeMilis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is inactive\n",color);
    }
}
