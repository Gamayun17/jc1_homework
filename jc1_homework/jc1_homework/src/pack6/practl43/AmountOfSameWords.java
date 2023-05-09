package jc1_homework.src.pack6.practl43;

import java.util.HashMap;
import java.util.Scanner;

public class AmountOfSameWords {

    //доделать!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите текст: ");
        String text = scanner.nextLine();
        String[] slovo = " ".split(text);
        HashMap<String,Integer> slovo = new HashMap<>();
        int countSlovo=0;
        String key= "ночь";
        for(int i = 0; i < slovo.size(); i++) {
        if (slovo.containsKey("ночь")) {
            countSlovo++;
        } else  System.out.println("Нет слова");
        }

        System.out.println("Количество повторений в тексте:"+ countSlovo );
    }
}