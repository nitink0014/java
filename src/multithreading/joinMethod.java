package multithreading;

import java.sql.SQLOutput;

public class joinMethod extends Thread  {

    @Override
    public void run() {
        System.out.printf("%s Thread Starting \n " , Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ending \n",Thread.currentThread().getName());
    }
}
