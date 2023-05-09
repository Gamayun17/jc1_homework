package jc1_homework.src.pack6.practl41;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SameNumbers {
    public static void main(String[] avgs) {
        int amount = 20;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int r = (int) (Math.random() * 10 + 1);
            numbers.add(r);
        }
        System.out.println("Список случайных чисел:" + numbers);
        Set<Integer> withoutSame = new LinkedHashSet<>(numbers);
        System.out.println("Список чисел без повторов:" + withoutSame);
    }
}