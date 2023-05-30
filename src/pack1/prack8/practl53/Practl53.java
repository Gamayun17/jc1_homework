package prack8.practl53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class Practl53 {
        public static void main(String[] args) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                new Thread(new AveThread()).start();
            }
        }
    }

        class AveThread implements Runnable {

            private static final double DEFAULT_AVERAGE =0.0 ;

            @Override
            public void run() {
                List<Integer> list = new ArrayList<>();
                Random ave = new Random();
                for (int i = 0; i < 10; i++) {
                    list.add(ave.nextInt(10));
                }
                       System.out.println(list.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(DEFAULT_AVERAGE));
                }
            }