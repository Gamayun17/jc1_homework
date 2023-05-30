package pack2.gl5;

public class Practl22 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 + 0);
            System.out.print(num[i] + " ");
        }
        int min = num[0];
        int minIn = 0;
        int max = num[0];
        int maxIn = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIn = i;
            }
            if (num[i] < min) {
                min = num[i];
                minIn = i;
            }
        }
        int maxInLow = maxIn;
        int maxInHigh = maxIn;
        for (int i = maxIn; i < num.length; i++) {
            if (num[i] == max) {
                maxInHigh = i;
            }
        }
        int minInLow = minIn;
        int minInHigh = minIn;
        for (int i = minIn; i < num.length; i++) {
            if (num[i] == min) {
                minInHigh = i;
            }
        }

        if ((minInLow < maxInLow) && (minInHigh < maxInHigh)) {
            for (int i = minInLow + 1; i < maxInHigh; i++) {
                sum += num[i];
            }
        }
        if ((maxInLow < minInLow) && (maxInHigh < minInHigh)) {
            for (int i = maxInLow + 1; i < minInHigh; i++) {
                sum += num[i];
            }
        }
        if ((minInLow < maxInLow) && (maxInHigh < minInHigh)) {
            if ((maxInHigh - minInLow) >= (minInHigh - maxInLow)) {
                for (int i = minInLow + 1; i < maxInHigh; i++) {
                    sum += num[i];
                }
            } else {
                for (int i = maxInLow + 1; i < minInHigh; i++) {
                    sum += num[i];
                }
            }
        }
        if ((maxInLow < minInLow) && (minInHigh < maxInHigh)) {
            if ((maxInHigh - minInLow) >= (maxInLow - minInHigh)) {
                for (int i = minInLow + 1; i < maxInHigh; i++) {
                    sum += num[i];
                }
            } else {
                for (int i = maxInLow + 1; i < minInHigh; i++) {
                    sum += num[i];
                }
            }
        }
        System.out.println(sum);
    }
}