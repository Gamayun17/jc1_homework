package pack5.practl35;

public abstract class Staff {
    String position;
    double wage;

    abstract int calcSalary();
    abstract String getPosition();


    public static void main(String[] args) {

        Manager myManager = new Manager();
        System.out.println("Это " + myManager.getPosition() + " Зарплата: "  + myManager.calcSalary());

        Master myMaster = new Master();
        System.out.println("Это " + myMaster.getPosition() + " Зарплата: " + myMaster.calcSalary());

        Worker myWorker = new Worker();
        System.out.println("Это " + myWorker.getPosition() + " Зарплата: " + myWorker.calcSalary());
    }
}