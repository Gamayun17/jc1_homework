package pack5.practl35;

import java.util.Scanner;

public class Worker extends Staff{
    public Worker(){
        super();
    }
    double mixedSalary;

    public int calcSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество выручки");
        int wage=scanner.nextInt();
        System.out.println("Введите комиссионный процент от выручки");
        int percent=scanner.nextInt();
        System.out.println("Введите зарплату по договору");
        int zp=scanner.nextInt();
        return (wage*percent)+zp;
    }

    public String getPosition() {
        return "Рабочий";
    }
}