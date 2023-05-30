package pack2.gl4;

public class Pract16 {
    public static void main(String args[]) {
        boolean num = true;
        for (int F = 50; F <= 70; F++) {
            for (int i = 2; i < F; i++) {
                if (F % i == 0) {
                    num = false;
                    break;
                }
            }
            if (num) System.out.println(F);
            else num = true;
            }
        }
    }