package Exercicios17;
import java.util.Scanner;
public class CincoMaior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número:");
            num = input.nextInt(); 
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número digitado foi "+maior);
    }
}