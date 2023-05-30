package pack5.pract34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BelcartPremium belcartPremium= new BelcartPremium();
        MastercardStandard mastercardStandard= new MastercardStandard();


            System.out.println("Enter the number 1 or 2");
            Scanner scanner = new Scanner(System.in);
            int localOrInternational = scanner.nextInt();

        switch (localOrInternational) {
            case 1:
                belcartPremium.getInfo();
                break;
            case 2:
                mastercardStandard.getInfo();
                break;
            default:
                System.out.println("Please, try again.");
        }
        }

    }
