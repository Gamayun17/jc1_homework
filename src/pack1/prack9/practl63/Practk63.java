package prack9.practl63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Practk63 {
    public static void main(String[] args) {
        List<Person> people= new ArrayList<Person>();
        int maxAge=30;
       int  minAge=15;
        Random ran= new Random();
        String[] name2=  {"Иван","Андрей","Яков","Юрий","Евгений","Марко"};
        String[] surname2= {"Иванов" , "Смирнов" , "Кузнецов", "Попов" , "Васильев","Петров"};
       for (int i = 0; i < 100; i++) {
            String name= "Имя "+ name2[ran.nextInt(name2.length)];
            String surname= "Фамилия " +surname2[ran.nextInt(surname2.length)];
            int age=ran.nextInt(maxAge-minAge+1)+minAge;
            people.add(new Person(name,surname,age));
        }
       List<String> surname3=people.stream()
               .filter(p -> p.getAge() <21)
               .peek(person -> System.out.println(person.getName()+" "+person.getSurname()+" Возраст= "+person.getAge()+"."))
               .sorted(Comparator.comparing((Person p)-> p.getSurname()).thenComparing((Person p)-> p.getName()))
               .limit(4)
               .map(Person::getSurname)
               .collect(Collectors.toList());
       System.out.println(surname3);
    }

}
