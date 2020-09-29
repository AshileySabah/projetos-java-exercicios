package Exercicios13;
import java.util.Scanner;
public class PesoIdeal {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        
        double pesoIdeal = 72.7*altura-58;
        System.out.println(pesoIdeal);
    }
}
