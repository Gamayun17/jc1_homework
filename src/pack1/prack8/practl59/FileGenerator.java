package prack8.practl59;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FileGenerator implements Callable<List<String>> {
    private final int NUM_FILES=10;
    private final int NUM_LINES=10;

    @Override
    public List<String> call() throws Exception {
        List<String> fileN = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < NUM_FILES; i++) {
            String fileName = ("файл_задание59 " + i + ".txt");
            fileN.add(fileName);
            try (BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName))) {
                for (int j = 0; j < NUM_LINES; j++) {
                    buffer.write("Произвольная строка:" + random.nextInt(100));
                    buffer.newLine();
                }
            } System.out.println("Поток "+ Thread.currentThread().getName()+ " " + "сгенированный файл "+fileName);
              Thread.sleep(3000);}

        return fileN;
        }
    }