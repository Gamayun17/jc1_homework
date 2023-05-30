package pack2.gl5;

public class Practl23  {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10 );
            System.out.print(num[i] + " ");
        }
        System.out.println("\nРеверс:");
        for (int i = 0; i < num.length / 2; i++) {
            int rev = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = rev;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
