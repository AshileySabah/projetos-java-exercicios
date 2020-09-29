package Exercicios13;
import java.util.Scanner;
public class Metros{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor em metros: ");
        double metros = input.nextDouble();
        
        System.out.println("O valor correspondente em centímetros é "+(metros*100));
    }
}
