package pack2.gl5;

public class Pract19 {
    public static void main(String[] args) {
        int num[]=new int[10];
        for (int i=0; i<10; i++) {
            num[i] = (int) (Math.random() * 10 + 1);
                 //System.out.println("Произвольное число " + num[i]);
            if (i == 9) {
                System.out.println("Последнее произвольное число "+ num[i]);
            }
        }
    }
}
