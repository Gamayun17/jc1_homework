package prack8.practl55;

import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 6; i++) {
            MyThread thread = new MyThread();
            thread.setName("Thread " + i + " ");
            System.out.println(thread.getName());
            thread.start();
            thread.join();
        }
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            try (DataOutputStream dataOut = new DataOutputStream
                    (new BufferedOutputStream
                            (new FileOutputStream("Number_practl55")))
            ) {
                getArray();
                writeFile(dataOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private int[] num = new int[10];
        private void getArray() {
            for (int i = 0; i < 10; i++) {
                num[i] = (int) (Math.random() * 10 + 1);
            }
        }

        private void writeFile(DataOutputStream dataOut) throws IOException {

            for (int i = 0; i < 10; i++) {
                dataOut.writeInt(num[i]);
            }
        }
    }
}