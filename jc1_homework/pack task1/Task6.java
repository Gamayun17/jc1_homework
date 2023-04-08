public class Task6 {
    public static void main(String[] args) {
        int s = 370000000;
        int sec = s%60;
        int m = (s-sec) / 60;
        int min= m%60;
        int h =(m-min) /60;
        int da, n;
        int ned,d;

        da=h % 24;
        d=(h-da) / 24;
        n=d % 7;
        ned=(d-n) / 7;
        System.out.println(ned + " недель " + d + "дня" + h + " часов " + min + " минут " + sec + " секунд");
    }
}
