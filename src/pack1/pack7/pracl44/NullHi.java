package pack7.pracl44;

import java.util.Scanner;

public class NullHi {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int i2 = scanner.nextInt();
         Integer i1 = null;
         try{
             int i3 =(i1 + i2) + (i1 * i2);
         } catch (NullPointerException e){
             System.out.println("Null pointer exception");
         }
     }
 }

