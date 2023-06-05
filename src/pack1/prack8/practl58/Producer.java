package prack8.practl58;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private final Queue<Integer> queue;
    private final Object lock;
    private final Warehouse wh;

    public Producer(Queue<Integer> queu, Object lock, Warehouse wh) {
        this.queue = queue;
        this.lock = lock;
        this.wh = wh;
    }

    @Override
    public void run() {
        Random ran = new Random();
        while (true) {
            synchronized (lock) {
                while (queue.size() == wh.getSleepInterval()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int product = ran.nextInt(100) + 1;
                queue.add(product);
                System.out.println(Thread.currentThread().getName()+ "произвели" + product);
                lock.notifyAll();
                if (wh.done()) {
                    break;
                }
            }
        }
    }
}
