package jc1_homework.src.pack6.practl43;

import java.util.HashMap;
import java.util.Scanner;

public class AmountOfSameWords {

   public static void main(String[] args) {
        HashMap<String, Integer> slovo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите текст: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

          for (int i = 0; i < words.length; i++) {
            if (slovo.containsKey(words[i])) {
                int key;
                key = slovo.get(words[i]);
                slovo.put(words[i], key + 1);
            } else {
                slovo.put(words[i], 1);
            }

            System.out.println("Количество повторений в тексте:" + slovo);
            }
        }
    }

// string ключ integer значение
