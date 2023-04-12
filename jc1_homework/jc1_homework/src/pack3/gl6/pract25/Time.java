package pack3.gl6.pract25;

import java.util.Scanner;

public class Time {
    private int sec;
    private int min;
    private int hour;

    Time(int s, int m, int h) {
        this.sec = s;
        this.min = m;
        this.hour = h;

        public int getHour () {
            return h;
        };
        public int getMin () {
            return m;
        };
        public int getSec () {
            return s;
        };
        public int toSec () {
            return h * 3600 + m * 60 + s;
        };

        public static Time ofSec( int s){
            final int h = s / 3600;
            s %= 3600;
            final int m = s / 60;
            s %= 60;
            return new Time(h, m, s);

        }
    }
}