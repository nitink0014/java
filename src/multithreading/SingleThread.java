package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintNumbers task1 = new PrintNumbers();
        service.submit(task1);
        service.shutdown();
    }
}
