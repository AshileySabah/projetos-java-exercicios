package Exercicios13;
import java.util.Scanner;
public class Numeros {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números inteiros e um número real: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double num3 = input.nextDouble();
        
        System.out.println((num1*2)*(num2/2));
        System.out.println((num1*3)+num3);
        System.out.println(num3*num3*num3); // ou System.out.println(Math.pow (num3, 3));
    }
}
