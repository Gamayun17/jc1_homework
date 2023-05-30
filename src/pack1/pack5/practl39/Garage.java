package pack5.practl39;

import java.util.Scanner;

public class Garage <T extends Venicle> {

private String brand;
private String colour;

public String getBrand() {return brand;}
String getColour() {
        return colour;
        }

public Garage() {
        dataNew();
        }

public void dataNew() {
        System.out.println("Введите бренд транспортного средства: ");
        Scanner scanner = new Scanner(System.in);
        brand = scanner.nextLine();
        System.out.println("Введите цвет: ");
        colour = scanner.nextLine();
        try{

                if (!brand.matches("^[a-zA-Z0-9]+$") || !colour.matches("^[a-zA-Z0-9]+$")) {
                        throw new Exception("Ошибка!Использована не латиница");
                }else{System.out.println("Все верно");}
        }catch (Exception e){
                System.out.println(e.toString());}}}