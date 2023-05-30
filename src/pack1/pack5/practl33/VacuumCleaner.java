package pack5.practl33;

public class VacuumCleaner extends HomeCleaningEquipment {
    public VacuumCleaner(String name) {
        super(name);
    }
    public void plugIn() {
        System.out.println("Включить в розетку пылесос");
    }
}
