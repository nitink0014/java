package multithreading;

public class testClass {

    public static void main(String[] args) throws InterruptedException {
        joinMethod t1 = new joinMethod();
        joinMethod t2 = new joinMethod();
        joinMethod t3 = new joinMethod();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();


    }
}
