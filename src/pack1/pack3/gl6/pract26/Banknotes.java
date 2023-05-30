package pack3.gl6.pract26;

public class Banknotes {
    private final int amount;
    private int num;

    public Banknotes(int amount, int num) {
        this.amount = amount;
        this.num = num;
    }

    public int getAmount() {
        return amount;
    }

    public int getNum() {
        return num;
    }

    public void decreaseNum() {
        num--;
    }

}
