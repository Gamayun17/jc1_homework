package prack8.practl56;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i < 11; i++) {
            MyThread thread = new MyThread();
            thread.setName("Thread " + i + " ");
          //  System.out.println(thread.getName());
            thread.start();
            thread.join();
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (MyThread.class) {
                    System.out.println(Thread.currentThread().getName() + "\n ");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }