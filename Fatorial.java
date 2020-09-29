package Exercicios17;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        int i;
        int fatorial = 1;
        for(i = num; i >= 1; i--){
            System.out.print(i+"! ");
            fatorial = fatorial*i;
        }
        System.out.print("= "+fatorial);
    }
}