package prack9.practl64;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practl64 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите minValue ");
    int minValue = sc.nextInt();
    System.out.println("Введите maxValue ");
    int maxValue = sc.nextInt();

    int n = 77;
        List<Integer> numbers = IntStream.rangeClosed(minValue, maxValue)
                .boxed()
                .limit(n)
                .collect(Collectors.toList());
    //    System.out.println(numbers);
    boolean threeOrFive = numbers.stream()
            .anyMatch(i -> i % 3 == 0 && i % 5 == 0);
        System.out.println("В данной коллекции содержатся числа,которые делятся на 3 и на 5 "+threeOrFive);
}
}


