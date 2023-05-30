package prack8.practl60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGeneratorTwo implements Callable<String> {
    private static final int NUM_NUMBERS=10;

    @Override
    public String call() throws Exception {
        List<Integer> fileN = new ArrayList<>();
        Random random = new Random();
        int summa=0;
        for (int i = 0; i < NUM_NUMBERS; i++) {
            int fileNum=random.nextInt(10);
            fileN.add(fileNum);
            summa+=fileNum;
            } System.out.println("Поток "+ Thread.currentThread().getName()+ " " + "сгенированные числа "+fileN+"="+ summa);
            Thread.sleep(10000);
            return String.valueOf(summa);
    }
}