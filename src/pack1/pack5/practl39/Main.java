package pack5.practl39;

public class Main {
    public static void main(String[] args) {

        Garage<Car> car = new Garage<>();
        System.out.println("Бренд машины: "+ car.getBrand());
        System.out.println("Цвет машины: "+ car.getColour());

        Garage<Motorcycle> motorcycle = new Garage<>();
        System.out.println("Бренд машины: "+motorcycle.getBrand()+"Цвет машины: "+motorcycle.getColour());
    }


}