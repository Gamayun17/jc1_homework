package pack7B.practl48;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String text = "Итак, построим порядок сериалов и фильмов «Звездный путь», в котором смотреть франшизу будет...";
        File file = new File("StarTrek.txt");
        try (FileWriter fileW = new FileWriter(file)) {fileW.write(text);}
        catch (IOException e) {e.printStackTrace();}
        try {
            String content = new String(Files.readAllBytes(Paths.get("text.txt")));
            int punctuationCount = 0;
            Pattern pattern= Pattern.compile("[\\.,:;\\-!?()\"]");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                punctuationCount++;
                System.out.println("Знаков препинания: " + punctuationCount);
            }

            int wordCount = 0;
            Pattern pattern1 = Pattern.compile("\\s*[A-Za-zА-Яа-я0-9'_-]+\\s*");
            Matcher matcher1 = pattern1.matcher(content);
            while (matcher1.find()) {
                wordCount++;
                System.out.println("Слов: " + wordCount);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}