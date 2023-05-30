package prack8.practl54;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
        public static void main(String[] args) throws InterruptedException {

            for (int i = 1; i < 11; i++) {
                MyThread thread = new MyThread();
                thread.setName("\nThread " + i + " ");
                System.out.println(thread.getName());
                thread.start();
                thread.join();
            }
        }

static class MyThread extends Thread {
    @Override
        public void run() {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int r = (int) (Math.random() * 10 + 1);
                list.add(r);
            }
           System.out.println("List numbers: " + list);
            int maximum = list.get(0);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                int nextNumber = (int) iterator.next();
                if (nextNumber > maximum) {
                    maximum = nextNumber;
                }
            }
            System.out.print("\nMax number: " + maximum);
        }
    }
}
