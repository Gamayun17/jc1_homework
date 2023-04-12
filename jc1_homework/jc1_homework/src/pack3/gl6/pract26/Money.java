package pack3.gl6.pract26;

public class Money {
    private int amount;
   private int num;

    public Money(String s, int i){
       this.amount=s;
        this.num=i;

    }

    public int getNum(){
        return num;
    }

    public int getAmount(){

        return amount;
    }

    public void decreaseNum(){
        num--;
    }
}
