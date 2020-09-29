package Exercicios13;
import java.util.Scanner;
public class Soma{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();
        System.out.println(num1+num2);
    }
}
