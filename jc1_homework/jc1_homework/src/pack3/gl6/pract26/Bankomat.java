package pack3.gl6.pract26;

import java.util.Scanner;

import static pack3.gl6.pract26.Balance.money;

public class Bankomat {

    static Balance[] balances;

    public static void startMenu() {

                System.out.println("Выберите операцию: 1. Вывод средств 2. Пополнение счета");
                int choice[]
                switch (choice) {
                    case 1:
                        System.out.println("---> Вывод средств");
                        System.out.println("Введите сумму:");
                        int withdraw = input.nextInt();   //где-то добавить общий акк,меню что выводит и суммирует весь баланс
                        if (money >= withdraw) {
                            money= money - withdraw;
                            System.out.println("Заберите деньги. Текущий баланс: " + money);
                        } else if (withdraw >= money) {
                            System.out.println("Недостаточно средств");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;
                    case 2:

                        System.out.println("---> Поплнение средств");
                        System.out.println("Введите сумму");
                        double moreMoney = input.nextDouble();
                        if (moreMoney > 0 && moreMoney <= 2000) {
                            if (moreMoney % 20 == 0 || moreMoney% 50 == 0) {
                                money += moreMoney;
                                System.out.println("Успешно!"+ money);
                            }
                        } else if (moreMoney > 2000) {
                            System.out.println("Максимальная сумма депозита за один раз: 2000");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;

                    default:
                        System.out.println("Неизвестная операция");
                        break;
                }


        }

    }

    public static void print(Money[] money) {
        for (int chooseNum = 1; chooseNum <= money.length; chooseNum++) {
            int i =chooseNum - 1;
            if (money[i] == null || money[i].getNum() <= 0) continue;
            System.out.println("[" + chooseNum + "] " + money[i].getAmount());
        }
    }

    public static void promptSelectMoney() {
        System.out.println("Сумма:");
    }

    public static int readChooseNum() {
        Scanner scanner = new Scanner(System.in);
        String moneyNumPattern = "[1-3]";
        boolean isCorrectValue = false;
        int chooseNum = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(moneyNumPattern)) {
                isCorrectValue = true;
               chooseNum = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return chooseNum;
    }


}



