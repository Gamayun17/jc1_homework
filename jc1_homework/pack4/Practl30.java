package pack4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practl30 {
    public final static String pt = "0[xX][[:xdigit:]]{1,4}";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(pt);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        Matcher m = pattern.matcher(s);
        //
        if (m.find()) {
            System.out.println(m.group());
        }
        else
            System.out.println("Not found");
    }
}