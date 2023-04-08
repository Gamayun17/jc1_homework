package pack2.gl3;

import java.util.Scanner;

public class pract11 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите a:");
        int a = Scanner.nextInt();
        System.out.print("введите b:");
        int b = Scanner.nextInt();
        System.out.print("введите c:");
        int c = Scanner.nextInt();
        System.out.print("введите d:");
        int d = Scanner.nextInt();
        System.out.print("введите e:");
        int e = Scanner.nextInt();
        System.out.print("введите f:");
        int f = Scanner.nextInt();
        Scanner.close();

        if ((e >= (a + c)) && (f >= b && b >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= b && b >= c)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e>= (b + c)) && (f >= a && b >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && b >= c)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (a + c)) && (e >= b && a >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (a + d)) && (e >= b && a >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + c)) && (e >= a && a >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (b + d)) && (e >= a && a >= c)) {
            System.out.println(" Можно построить 2 дома");
        }
        else
            System.out.println("Нельзя построить 2 дома");

    }
}
