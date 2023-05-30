package pack4;

import java.util.Scanner;

public class Practl31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        String replace = s.replaceAll("<p id=p1>", "<p>");
        System.out.println(replace);
        scanner.close();
    }
}
