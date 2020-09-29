package Exercicios13;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do círculo");
        double raio = input.nextDouble();
        final double pi = 3.1415;
        double areaCirculo = pi*(raio*raio);
        System.out.println("A área dessa circunferência é "+areaCirculo);
        /*
        * ou
        * double areaCirculo = Math.PI * Math.pow (raio, 2);
        */
    }
}