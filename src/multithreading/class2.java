package multithreading;

public class class2 extends Thread{


    public void run(){

        for(int x=0;x<=10;x++){
            System.out.print("\nHello From Thread 2");
        }
        System.out.println("Thread two is completed");
    }
}
