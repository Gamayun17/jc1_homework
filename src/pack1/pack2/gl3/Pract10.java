package pack2.gl3;

public class Pract10 {
    public static void main(String[] args) {

        {

            int a = 2;
            int m = 4;
            int c = 2023;

            if ((a== 28 )&& m == 2 && c % 4 == 0 && c % 400 == 0 && c % 100 != 0) {
                a = 1;
                m++;
                System.out.println("дата следующего дня: " + c + "/" + m + "/" + a);
            } else if ((a== 29) && m == 2 && !(c%4 == 0 && c%400 == 0 && c%100 != 0))
        {
            a = 1; m ++;
            System.out.println("дата следующего дня: " + c + ":" + m + ":" + a);
        }
             else if   ((a== 31) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) {
                a = 1;
                m++;
                System.out.println("дата следующего дня: " + c + "/" + m + "/" + a);
            } else if ((a== 30) && (m == 2 || m == 4 || m == 6 || m == 9 || m == 11)) {
                a = 1;
                m++;
                System.out.println("дата следующего дня: " + c + "/" + m + "/" + a);
            } else if ((a== 31)&& m == 12) {
                a = 1;
                m = 1;
                c++;
                System.out.println("дата следующего дня: " + c + "/" + m + "/" + a);
            } else {
                a++;
                System.out.println("дата следующего дня: " + c + "/" + m + "/" + a);
            }

        }
    }
}