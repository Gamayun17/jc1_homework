package pack1;

import java.util.Scanner;

public class Practl5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner
                (System.in);
        System.out.println("Введите число");
        int a=scanner.nextInt();

        System.out.println(summa(a,2));

    }   static int summa(int a, int b){
        int c=a+b;
        int d=a*b;
        return c+d;
    }
}
