package prack9.practl62;


import java.util.stream.IntStream;



public class Practl62 {

    public static void main(String[] args) {


        double numbers = IntStream.iterate(1, i-> i+1 )
                .limit(20)
                .filter(i -> i % 2 == 0)
                .peek(i->System.out.println(i+ "-дюйма"))
                .mapToDouble(i -> i*2.54)
                .peek(i->System.out.println(i+ "-сантиметра"))
                .sum();
        System.out.println("\nСумма в сантиметрах="+numbers);
        }
    }
