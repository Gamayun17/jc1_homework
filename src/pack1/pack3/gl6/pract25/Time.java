package pack3.gl6.pract25;




public class Time {
    private   int sec;
    private  int min;
    private  int hour;

   Time(int sec, int min,int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
        }
    int getToSec() {
        return (hour*3600)+(min*60)+sec;
    }

    public static Time amountSec(int sec) {
        final int hour = (sec / 3600) % 24;
        sec %= 3600;
        final int min = sec / 60;
        sec = sec % 60;
        return new Time(hour, min, sec);
    }

    public int compareTo(Time o) {
        final int hC = Integer.compare(hour, o.hour);
        if (hC != 0) {
            return hC;
        }
        final int mC = Integer.compare(min, o.min);
        if (mC != 0) {
            return mC;
        }
        return Integer.compare(sec, o.sec);
    }
}