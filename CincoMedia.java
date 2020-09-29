package Exercicios17;
import java.util.Scanner;
public class CincoMedia {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        double num;
        double soma = 0;
        double media;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número:");
            num = input.nextDouble();
            
            soma += num;
        }
        System.out.println("Soma = "+soma);
        media = soma/5;
        System.out.println("Média = "+media);
    }
}