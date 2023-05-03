package jc1_homework.pack5.pract38;

import java.util.Scanner;

import static jc1_homework.pack5.pract38.Month.*;

public enum Season {
    Winter(1),
    Spring(2),
    Summer(3),
    Autumn(4);

    private final int number;

    Season(int number) {
        this.number = number;
    }

    Scanner scanner = new Scanner(System.in);


    public int sumDaysOfSeason() {
        System.out.println("Enter the number from 1 to 4"+" 1 - winter, 2 - spring, 3 - summer, 4 - autumn.");
        Scanner scanner = new Scanner(System.in);
        int numberSeason = scanner.nextInt();
        int sum1;
        int sum2;
        int sum3;
        sum1= MARCH.number+ APRIL.number+ MAY.number;
        sum2= JUNE.number+ JULY.number+ AUGUST.number;
        sum3= SEPTEMBER.number+ OCTOBER.number+ NOVEMBER.number;
        switch (numberSeason) {
            case 1:
                System.out.println( "Amount of days is " );
                return DECEMBER.number+ JANUARY.number + FEBRUARY.number;
            case 2:
                System.out.println("Amount of days is "+  sum1 );
                break;
            case 3:
                System.out.println("Amount of days is "+ sum2  );
                break;
            case 4:
                System.out.println("Amount of days is " + sum3 );
                break;
            default:
                System.out.println("Please, try again.");
        }
        return sumDaysOfSeason();
    }
    }