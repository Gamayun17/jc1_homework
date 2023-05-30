package pack2.gl3;

import java.util.Scanner;

public class Pract12 {
    // Реализация метода ввода с клавиатуры
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число:" + " 1-Понедельник," + " 2-Вторник, " + "3-Среда," + " 4-Четверг," + " 5-Пятница," + " 6-Суббота," + " 7-Воскресенье:");
        int a = Scanner.nextInt();
        Scanner.close();


        switch (a) {
            case 1:
                System.out.println("Понедельник: В 6 занятия Java");
                System.exit(0);
                break;
            case 2:
                System.out.println("Вторник: Почитать книгу");
                System.exit(0);
                break;
            case 3:
                System.out.println("Среда: Посмотреть фильм");
                System.exit(0);
                break;
            case 4:
                System.out.println("Четверг: В 6 занятия Java");
                System.exit(0);
                break;
            case 5:
                System.out.println("Пятница:Сходить в тренажерный зал");
                System.exit(0);
                break;
            case 6:
                System.out.println("Суббота:Начать читать книгу по Java");
                System.exit(0);
                break;
            case 7:
                System.out.println("Воскресенье:Сделать дз");
                System.exit(0);
                break;
            default:
                System.out.println("Введите число от 1 до 7");
                System.exit(0);
        }
        return;

    }
}
