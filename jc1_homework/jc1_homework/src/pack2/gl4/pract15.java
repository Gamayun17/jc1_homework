package pack2.gl4;

public class pract15 {
    public static void main(String args[]){

    long number = 7893823445L;
    int sum = 0;
     while(number!=0){
        sum+=number%10;
        number/=10;

    }
         System.out.print(sum);
}

}
