package pack4;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practl27 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[.!?,\\-]");
        Matcher m = p.matcher("Тестовая, .строка,, с несколькими!! знаками препинания,");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match number: " + count);
            System.out.println("group() : " + m.group());
        }
    }
}
