package multithreading;

import java.sql.SQLOutput;

public class class1 extends Thread {

    @Override
    public void run() {
        for(int x= 1; x<=10 ;x++){
            System.out.printf("\nHello From Thread 1");
        }
        System.out.println("Thread One is completed");
    }
}
