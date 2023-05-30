package pack3.gl6.pract26;

import java.util.Scanner;
import static pack3.gl6.pract26.Account.balance;
import static pack3.gl6.pract26.Account.input;
public class UDisplay {
    static boolean flag = Account.flag;

    public static void startMenu() {

        if (flag) {
            char answer = 'x';
            while (answer == 'x') {
                System.out.println("Выберите операцию: 1. Вывод средств 2. Пополнение счета 3. Проверка баланса");
                int ch = input.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Вывод средств");
                        System.out.println("Введите сумму:");
                        int withdraw = input.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Заберите деньги. Текущий баланс: " + balance);
                        } else if (withdraw >= balance) {
                            System.out.println("Недостаточно средств");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;
                    case 2:

                        System.out.println(" Депозит");
                        System.out.println("Введите сумму");
                        double saveM = input.nextDouble();
                        if (saveM > 0 && saveM <= 3000) {
                            if (saveM % 20 == 0 || saveM % 50 == 0) {
                                balance += saveM;
                                System.out.println("Успешно! Баланс BYN " + balance);
                            }
                        } else if (saveM > 3000) {
                            System.out.println("Максимальная сумма депозита за один раз: 3000");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;
                    case 3:

                        System.out.println(" Проверить баланс");
                        System.out.println("Баланс: " + balance + "BYN");
                        break;

                    default:
                        System.out.println("Неизвестная операция");
                        break;
                }
                System.out.println("Продолжить? Да(x) / Нет(n)");
                answer = input.next().charAt(0);

            }
            System.out.println("Ошибка!!! Завершение сеанса");

        }

    }

    public static void print(Banknotes[] banknotes) {
        for (int banknotesNum = 1; banknotesNum <= banknotes.length; banknotesNum++) {
            int i = banknotesNum - 1;
            if (banknotes[i] == null || banknotes[i].getNum() <= 0) continue;
            System.out.println("[" + banknotesNum + "] " + banknotes[i].getAmount() + " BYN");
        }
    }

    public static void selectBanknotes() {
        System.out.println("Сумма:");
    }

    public static int readBanknotes() {
        Scanner scanner = new Scanner(System.in);
        String banknotesNumberPattern = "[1-3]";
        boolean isCorrectValue = false;
        int banknotesNum = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(banknotesNumberPattern)) {
                isCorrectValue = true;
                banknotesNum = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return banknotesNum;
    }

}