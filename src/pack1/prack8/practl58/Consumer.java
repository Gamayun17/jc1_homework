package prack8.practl58;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final Object lock;
    private final Warehouse wh;

    public Consumer(Queue<Integer> queue, Object lock, Warehouse wh) {
        this.queue = queue;
        this.lock = lock;
        this.wh = wh;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (queue.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int product = queue.poll();
                System.out.println(Thread.currentThread().getName() + " потребляемый номер элемента " + product);
                wh.addAmountItems();
                if (queue.size() == wh.getTimeoutInterval()) {
                    lock.notifyAll();
                }
                if (wh.done()) {
                    break;
                }
            }
        }
    }
}