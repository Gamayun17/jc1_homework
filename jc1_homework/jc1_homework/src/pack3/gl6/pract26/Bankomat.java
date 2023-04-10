package pack3.gl6.pract26;

import java.util.Scanner;

public class Bankomat {
    final Money[] money = {
            new Money("20", 60),
            new Money("50", 40),
            new Money("100", 56)
    };  //это изначальное количество денег в банкомате


   //выбрать действие выдать или снять
    //public void chooseAction(){
    //System.out.println()


// добавить деньги, n это вся сумма денег
    public int addMoney(){
        Scanner scanner=new Scanner(System.in);
        boolean isBanknoteCorrect;
        int n; int s=1;
        do {
            n = scanner.nextInt();
            isBanknoteCorrect = n % 20 == 0 || n % 50 == 0 || n % 100 == 0;
            if (isBanknoteCorrect) {
                if n % 20 == 0 {
                    Money money = money[money.num + n];
                }
                   else if n % 50 == 0 {
                    String amount = money[s+1].amount;;
                    Money money = money[money.num + n];
                }
                   else
                String amount = money[s+2].amount;;
                Money money = money[money.num + n];
            }
                if (!isBanknoteCorrect){
                    System.out.println("Принимаются купюры только номиналом 20,50,100:");
        } while (!isBanknoteCorrect);
            String amount = money[s+1].amount;
             System.out.println("Выбрана купюра номиналом"+ amount);
            return n;
    }



// выдать деньги
        public int takeMoney(){
            public void printAmount() {
                int s = 1;
                for (Money money : money) {
                    if
                    (money.num > 0) {
                        System.out.println(s + ":" + money.amount + "[" + money.num + "]");
                    }
                    s++;
                }
                System.out.println("Please select banknote:");
            else s>=4
                System.out.println("Выберите число от 1 до 3");

            if

   // Money money= money[moneyN-1];
   // money.num--;
  //  System.out.println("Заберите купюры"+money.amount);
      System.out.println("Reamin"+ money.num+ " of "+ money.amount);
   // }


}


