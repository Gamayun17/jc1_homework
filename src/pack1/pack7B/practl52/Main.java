package pack7B.practl52;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
                String[] nameC = {"София", "Мария", "Анна", "Ева", "Виктория", "Frank", "Алиса", "Полина,", "Александра", "Елизавета"};
                String[] surnameC = {"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров"};
                Random random = new Random();
                Person[] person1 = new Person[10];
                for (int i = 0; i < 10; i++) {
                        String name = nameC[random.nextInt(nameC.length)];
                        String surname = surnameC[random.nextInt(surnameC.length)];
                        int age = random.nextInt(100);
                        person1[i] = new Person(name, surname, age);
                }

                        File file = new File("Человек.txt");
                        try (FileWriter writer = new FileWriter(file)) {
                                for (Person person : person1) {
                                        writer.write(person.toString() + "\n");
                                }
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }