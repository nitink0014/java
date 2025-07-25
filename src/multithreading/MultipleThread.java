package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThread {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {
            for (int i = 1; i <= 10; i++) {
                TaskThread task = new TaskThread();
                service.submit(task);
            }
            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Emergency termintion");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
