package Exercicios19;
import java.util.Scanner;
public class Questao12{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int soma = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            soma += A[i];
        }
        System.out.println("Soma = "+soma);
    }
}