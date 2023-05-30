package pack7B.practl51;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
            String path = "новая_папка1/новая_папка2/новая_папка3";
            File file1 = new File(path);
            file1.mkdirs();

            Random random = new Random();
            for (int i = 1; i <= 5; i++) {
                String fileName = "Файл" + i + ".txt";
                File file = new File(file1, fileName);
                try (FileWriter writer = new FileWriter(file)) {
                    for (int j = 0; j < 10; j++) {
                        int num = random.nextInt(100);
                        writer.write(num + "\n");}
                } catch (IOException e) {e.printStackTrace();}}

            File[] files = file1.listFiles();
            if (files != null) {
                File allNumbers = new File(file1, "Числа.txt");
                try (FileWriter fileW = new FileWriter(allNumbers)) {
                    for (File file : files) {
                        if (file.isFile() && !file.getName().equals("Числа.txt")) {
                            List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
                            for (String line : lines) {
                                fileW.write(line + "\n");}}}
                } catch (IOException e) {e.printStackTrace();}

                File fileList = new File(file1, "ткст.txt");
                try (FileWriter writer = new FileWriter(fileList)) {
                    for (File file : files) {
                        if (file.isFile()) {
                            writer.write(file.getName() + "\n");}}
                } catch (IOException e) {e.printStackTrace();}
            }
        }
    }