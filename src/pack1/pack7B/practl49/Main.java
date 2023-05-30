package pack7B.practl49;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "1. Звездный путь / Star Trek: The Original Series (TOS) (1966 – 1969,2. Звездный путь: Новые приключения / Star Trek: New Voyages (2004-2016) 2";
        String nameFile = "The_Original.txt";
        writeText(text, nameFile);
        List<Integer> number = readNumber(nameFile);
        int sum = number.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nЧисла в тексте: " + number);
        System.out.println("\nСумма чисел: " + sum);
        System.out.println("\nЧисла в тексте(обновленный вариант без повторов): " + new HashSet<>(number));

    }

        private static List<Integer> readNumber (String nameFile){
            Pattern pn = Pattern.compile("\\b[\\d]+\\b");
            try (Scanner sc = new Scanner(new FileInputStream(nameFile))) {
                List<Integer> numbers = new ArrayList<>();
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    Matcher matcher = pn.matcher(line);
                    while (matcher.find()) {
                        String match = matcher.group();
                        int number = Integer.parseInt(match);
                        numbers.add(number);
                    }
                }
                return numbers;
            } catch (IOException e) {
                System.err.println("Ошибка!!! " + e.getMessage());
                return Collections.emptyList();
            }
        }
        private static void writeText (String text, String nameFile){
        try (FileWriter fileW = new FileWriter(nameFile)) {
            fileW.write(text);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    }