package pack3.gl6.pract26;

import java.util.Scanner;

public class Account {
    public static Scanner input = new Scanner(System.in);

    static int balance = 3000;
    static int password = 1234; // пароль
    static boolean flag = true;

    public static void user() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите пароль(1234): ");
            int inputPassword = input.nextInt();

            if (inputPassword == password) {
                flag = true;
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Неверный пароль. Осталось " + (3 - i) + " попытки");
                } else {
                    System.out.println("Завершение сеанса");
                    break;
                }
                flag = false;
            }
        }
    }

    public int sB() {
        return balance;
    }
}

