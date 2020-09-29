package Exercicios13;
import java.util.Scanner;
public class Farenheit {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = input.nextDouble();
        
        double celsius = (5*(farenheit-32)/9);
        
        System.out.println(farenheit+"F --> "+celsius+"°C");
    }
}
