package pack2.gl4;

import java.util.Scanner;

public class Practl18 {
    public static void main(String[] args) {
        int ct = 0;
        String prl = "";
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num != 0) {
            prl = (num % 10) + prl;
            ct++;
            num /= 10;
            if (ct == 3) {
                prl = " " + prl;
                ct = 0;
            }
        } System.out.println(prl);
    }
}