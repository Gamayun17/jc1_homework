package pack7.pracl46;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Idkname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите i2:");
        int i2 = scanner.nextInt();
        Integer i1 = null;
        try {
            int i3 = (i1 + i2) + (i1 / i2);
            System.out.println(i3);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка в выполнение арифметического вычисления");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}