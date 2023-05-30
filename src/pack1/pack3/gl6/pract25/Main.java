package pack3.gl6.pract25;

import static pack3.gl6.pract25.Time.amountSec;
public class Main {
    public static void main(String[] args) {

                Time a = new Time(758,0,0);
                Time b = new Time(2, 41, 5);

                System.out.println("Общее количество секунд "+a.getToSec());
                System.out.println("Общее количество секунд "+b.getToSec());
                System.out.println("Сравнение промежутков времени a и b с заданным общим количеством секунд \n 1-промежутки времени не равны,0-промежутки времени равны");
                System.out.println(a.compareTo(amountSec(3600)));
                System.out.println(b.compareTo(amountSec(3600)));
                 int c= a.compareTo(b);
                System.out.println("Сравнение 2 промежутков времени a и b ");
                if (c ==0){
                    System.out.println("2 промежутка времени равны");
                } else {
                    System.out.println("Промежутки времени не равны");
                }
                System.out.println();
            }
        }