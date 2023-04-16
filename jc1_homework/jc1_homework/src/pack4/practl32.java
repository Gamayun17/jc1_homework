package pack4;

public class practl32 {
    public static void main(String[] args) {
        String str1 = "";
        StringBuilder l = new StringBuilder(str1);
        final long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            l.append("aaabbbccc");
        }
        final long firstTime = System.currentTimeMillis() - startTime1;
        System.out.println("Время выполнения при использовании StringBuilder " +
                firstTime);

        final long startTime2 = System.currentTimeMillis();
        String str2 = " ";
        for (int i = 0; i < 1000000; i++) {
            str2 += "aaabbbccc";
        }
        final long secondTime = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения при использовании String " +
                secondTime);

        System.out.println(firstTime - secondTime);
    }
}
