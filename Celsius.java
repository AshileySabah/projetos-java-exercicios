package Exercicios13;
import java.util.Scanner;
public class Celsius {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        
        double farenheit = (celsius*9/5)+32;
        System.out.println(farenheit+"F --> "+celsius+"°C");
    }
}
