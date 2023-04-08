package pack2.gl3;

import java.util.Scanner;

public class pract9 {
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();
        int m=money%10;
        if (money%100>=4&&money%100<=14)
        {
            System.out.println(money+ " рублей");
        }
        else
        {
            switch (m)
            {
                case 1:
                    System.out.println(money+ " рубль");
                    break;
                case 2:
                    System.out.println(money+ " рубля");
                    break;
                default:
                    System.out.println(money+ " рублей");
            }
        }
    }

}
