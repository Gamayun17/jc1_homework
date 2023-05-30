package pack2.gl4;

import java.util.Scanner;

public class Pract17 {
    public static void main(String args[]) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if (num / 7 == 0 && num >= 1 && num < 100) {
            System.out.println("Hope!");
        } else {
            if (num > 100 || num < 1) {
                System.out.println("Введите число от 1 до 100");
            } else {
                System.out.println("Число не делится на 7 без остатка");
            }
        }
    }
}
