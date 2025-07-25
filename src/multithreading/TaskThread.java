package multithreading;

public class TaskThread implements  Runnable{
    public void run(){
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread %s\n",current.getName());
        try {
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with thread %s\n",current.getName());

    }
    private int getRandom(){
        return (int)(Math.random()*5)+1;
    }
}
