package pack3.gl6.pract26;

public class Balance {
    static Money[] money = {
            new Money("20", 60);
            new Money("50",40);
            new Money("100",56);
}
    public static Money[]addMoney(){
        return money;
    }
    public static Money[]addMoneychoose(int chooseNum){
        return money[chooseNum-1];
    }

    public static boolean takeMoney(Money selectMoney){
        if(selectMoney.getNum()==0){
            return false;
        }
        selectMoney.decreaseNum();
        return true;
    }
}
}
