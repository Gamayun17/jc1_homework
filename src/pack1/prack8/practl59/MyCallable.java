package prack8.practl59;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class MyCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            Future<List<String>> future = executor.submit(new FileGenerator());
            futures.add(future);
        }
        for (Future<List<String>> future : futures) {
            List<String> fileN = future.get();
            System.out.println("Сгенированные файлы: " + fileN);
        }
        executor.shutdown();
    }
}