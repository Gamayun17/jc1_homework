package prack8.practl58;

import java.util.LinkedList;
import java.util.Queue;

public class Warehouse {
    private static final int QUEUE_SIZE =200;
    private static final int SLEEP_INTERVAL =100;
    private static final int TIMEOUT_INTERVAL =80;
    private static final int  MAX_ITEM=10000;

    private final Queue<Integer> queue = new LinkedList<>();
    private final Object lock = new Object();
    private int addItems = 0;
    public int getSleepInterval(){
        return SLEEP_INTERVAL;
    }
    public int getTimeoutInterval(){
        return TIMEOUT_INTERVAL;
    }
    public void start() throws InterruptedException {
        Thread c1 = new Thread(new Consumer(queue, lock, this));
        Thread c2 = new Thread(new Consumer(queue, lock, this));
        Thread p1 = new Thread(new Producer(queue, lock, this));
        Thread p2 = new Thread(new Producer(queue, lock, this));
        Thread p3 = new Thread(new Producer(queue, lock, this));

        c1.start();
        c2.start();
        p1.start();
        p2.start();
        p3.start();

        c1.join();
        c2.join();
        p1.join();
        p2.join();
        p3.join();

    }
    public  void addAmountItems(){
        addItems++;
    }
    public boolean done(){
        return addItems == MAX_ITEM;
    }

}
