package pack4;

import java.util.Scanner;

public class practl28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        String[] list=s.split("[\\W]+");
        System.out.println(list.length);
    }
}
