package Exercicios17;
import java.util.Scanner;
public class Tabuada {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Digite um número para a ver sua tabuada:");
        int num = input.nextInt();
        for(i = 1; i <= 10; i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
