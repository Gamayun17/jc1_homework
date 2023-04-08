package pack2.gl3;

import java.util.Scanner;

public class pract7 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.print( isLastDigit(num));
    }

   static String isLastDigit(int x) {

        final int DIGIT=7;
        if ((x % 10) == DIGIT){
           return ("Последняя цифра равна 7");
        }
        else {
            return ("Последняя цифра не равна 7");
        }
    }
}
