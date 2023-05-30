package pack5.practl33;

public class Fridge extends ForSavingProducts implements Home {
    public Fridge(String name) {
        super(name);
    }

    @Override
    public void plugIn() {
       System.out.println("Включить в розетку холодильник");
    }
}
