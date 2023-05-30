package prack8.practl60;


import java.util.concurrent.*;

public class SecondCallable  {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> futures = new ExecutorCompletionService<>(executor);
        for (int i = 1; i < 11; i++) {
            futures.submit(new FileGeneratorTwo());
        }
        for (int i = 1; i < 11; i++) {
            Future<String> future = futures.take();
            String summa=future.get();
            System.out.println("Cумма сгенирированных чисел "+summa);
        }
        executor.shutdown();
    }
}