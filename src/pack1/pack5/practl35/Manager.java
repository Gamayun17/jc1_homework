package pack5.practl35;

import java.util.Scanner;

public class Manager extends Staff {

    public Manager() {
        super();
    }


    public int calcSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месячный оклад");
        int wage=scanner.nextInt();
        System.out.println("Введите количество дней в данном месяце");
        int amount=scanner.nextInt();
        int workDays=21;

        return wage/(amount*workDays);
    }

    public String getPosition() {
        return "Менеджер";
    }

}