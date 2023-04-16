package pack4;

import java.util.Scanner;

public class practl29 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        String[] list=s.split("\\s+");
        String lastWord = list[list.length-1];
        System.out.println(lastWord);
    }
}
