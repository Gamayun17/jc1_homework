package pack4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practl31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        String replace = s.replaceAll("<p id=p1>", "<p>");
        System.out.println(replace);
        scanner.close();
    }
}
