package pack2.gl3;

import java.util.Scanner;

public class Pract8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        int a = Scanner.nextInt();
        System.out.println("Введите ширину прямоугольника ");
        int b = Scanner.nextInt();
        System.out.println("Введите радиус r ");
        int r = Scanner.nextInt();
        Scanner.close();
        if ((r * r) < (((a * a) + (b * b)) / 4)) {
            System.out.println("Невозможно");
        } else {
            System.out.println("Возможно");
        }
    }
    }