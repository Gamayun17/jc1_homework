package pack5.practl35;

import java.util.Scanner;

public class Master extends Staff {
    public Master() {
        super();
    }

    public int calcSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выручку за день");
        int wage = scanner.nextInt();
        System.out.println("Введите процент");
        int i = scanner.nextInt();
        if (i < 0 || i > 5) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Все верно");
        }
        return ((wage * (i) / 10) * 21);
    }

    @Override
    String getPosition() {
        return  "Мастер";
    }
}
