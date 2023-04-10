package pack3.gl6.pract25;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int sec;
        int min;
        int hour;
     public Time( int s, int m, int h) {
            sec = s;
            min = m;
            hour = h;
            Scanner Scanner = new Scanner(System.in);
            System.out.print("введите s:");
            int s = Scanner.nextInt();
            System.out.print("введите m:");
            int m = Scanner.nextInt();
            System.out.print("введите h:");
            int h = Scanner.nextInt();
            Scanner.close();
        }
    }

    Time time1=new Time();
    Time time2= new Time();
    System.out.println(time1.compareTo(time2));
}
