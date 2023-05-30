package pack2.gl5;

public class Practl24 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int l, b;
        for (l = 0; l < arr.length / 2; l++) {
            for (b = 0; b < arr[l].length; b++) {
                if ((b < l) || (b >= (arr[l].length - l)))
                    arr[l][b] = 0;
                else
                    arr[l][b] = 1;
            }
        }
        for (l = arr.length - 1; l >= arr.length / 2; l--) {
            for (b = 0; b < arr[l].length; b++) {
                if ((b < (arr[l].length - 1 - l)) || (b > l))
                    arr[l][b] = 0;
                else
                    arr[l][b] = 1;
            }
        }
        for (l = 0; l < arr.length; l++) {
            for (b = 0; b < arr[l].length; b++) {
                System.out.print(arr[l][b]);
            }
            System.out.println(" ");
        }
    }
}