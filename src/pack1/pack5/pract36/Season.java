package pack5.pract36;

import java.util.Scanner;

public enum Season {
    Winter(1,90),
    Spring(2,92),
    Summer(3,92),
    Autumn(4,91);

    private final int number;
    private final int countOfDays;

    Season(int number,int countOfDays) {
        this.number = number;
        this.countOfDays= countOfDays;
    }

    Scanner scanner = new Scanner(System.in);

    public int getSeason() {
        System.out.println("Enter the number from 1 to 4");
        Scanner scanner = new Scanner(System.in);
        int numberSeason = scanner.nextInt();

        switch (numberSeason) {
            case 1:
                System.out.println("WINTER "+Season.Winter.countOfDays+" days");
                break;
            case 2:
                System.out.println("SPRING "+Season.Spring.countOfDays+" days");
                break;
            case 3:
                System.out.println("SUMMER "+Season.Summer.countOfDays+" days");
                break;
            case 4:
                System.out.println("AUTUMN "+Season.Autumn.countOfDays+" days");
                break;
            default:
                System.out.println("Please, try again.");
        }
        return getSeason();
    }

}
