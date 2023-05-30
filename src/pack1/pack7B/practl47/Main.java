package pack7B.practl47;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("/D:/jc1_homework/");
        String[] fileList = file.list();

        try {
            List<String> nameFile = new ArrayList<>();
            List<String> nameDirectory = new ArrayList<>();

            for (String name : fileList) {
                if (!new File(file, name).isDirectory()) {nameFile.add(name);}
                else {nameDirectory.add(name);}}
            System.out.println("Файлы в директории: ");
            nameFile.forEach(System.out::println);
            System.out.println("Директории: ");
            nameDirectory.forEach(System.out::println);}
        catch (NullPointerException e) {
            System.out.println("Ошибка!!!");
            e.printStackTrace();
        }
    }
}
