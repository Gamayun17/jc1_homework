package pack3.gl6.pract26;

public class Bankomat {   public Bankomat() {
    UDisplay uDisplay = new UDisplay();
    Storage banknotesStorage = new Storage();
    Account account = new Account();
}

    public void work() {
        System.out.println("Банкомат");
        Account.user();
        UDisplay.startMenu();
    }

}
