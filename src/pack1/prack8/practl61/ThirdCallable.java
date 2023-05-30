package prack8.practl61;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThirdCallable {
    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        FileWriter fil = null;
        try {
            fil = new FileWriter("meow.txt");
            for (int i = 1; i < 11; i++) {
                executor.submit(new ThirdWrote(fil));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
            }
            if (fil != null) {
                try {
                    fil.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThirdWrote implements Callable<Void> {

        private final FileWriter fil;

        public ThirdWrote(FileWriter fil) {
            this.fil = fil;
        }

        @Override
        public Void call() throws Exception {
            String message = "Hello World " + LocalDateTime.now();
            synchronized (fil) {
                fil.write(message + "\n");
            }
            System.out.println( Thread.currentThread().getName() + ", сообщение потока(+сегодняшняя дата): "+ message);
            return null;
        }
    }
}