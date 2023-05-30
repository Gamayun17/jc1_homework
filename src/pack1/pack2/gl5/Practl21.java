package pack2.gl5;

public class Practl21 {
    public static void main(String[] args) {
        int num[] = new int[10];
        int maxNumber = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 10 );
            System.out.print(num[i] + " ");
        }
        int ind=1;
          for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNumber) {
                maxNumber = num[i];
                ind = i;
            }
        System.out.println("Индекс максимального элемента " + maxNumber + " " + ind);
    }
}
}

