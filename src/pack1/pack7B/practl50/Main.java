package pack7B.practl50;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fileName = "рандом.bin";
        int l = 20;
        int[] number = new int[l];
        Random random = new Random();

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < l; i++) {
                int num = random.nextInt(100);
                output.writeInt(num);
                number[i] = num;}
        } catch (IOException e) {e.printStackTrace();}

        try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < l; i++) {
                number[i] = input.readInt();}
        } catch (IOException e) {e.printStackTrace();}

        double sum = 0;
        for (int num : number) {
            System.out.println(num);
            sum += num;
        }
        double ave = sum / l;
        System.out.println("Среднее арифметическое: " + ave);
    }
}
