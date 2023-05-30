package pack5.pract37;

import java.util.Scanner;

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


    public int getSeason() {
        System.out.println("Enter the number from 1 to 4"+" 1 - winter, 2 - spring, 3 - summer, 4 - autumn.");
        Scanner scanner = new Scanner(System.in);
        int numberSeason = scanner.nextInt();

        switch (numberSeason) {
            case 1:
                System.out.println( "Next season is " +Season.Spring );
                break;
            case 2:
                System.out.println("Next season is " +Season.Summer);
                break;
            case 3:
                System.out.println("Next season is " +Season.Autumn);
                break;
            case 4:
                System.out.println("Next season is " +Season.Winter);
                break;
            default:
                System.out.println("Please, try again.");
        }
        return getSeason();
    }

}