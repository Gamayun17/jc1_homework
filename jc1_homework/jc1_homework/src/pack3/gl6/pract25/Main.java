package pack3.gl6.pract25;


import  static pack3.gl6.pract25.Time.ofSec;
public class Main {
    public static void main(String[] args) {

        Time one = new Time();

        one.allTime(1.h, 1.m, 1.s);

        System.out.println(one.compareTo(ofSec(3600)));
    }
}