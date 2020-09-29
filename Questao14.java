package Exercicios19;
import java.util.Scanner;
public class Questao14 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int soma = 0;
        int contador = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            if(A[i]%2 != 0){
                soma += A[i];
                contador++;
            }
        }
        double media = (double)soma/contador;
        System.out.println("Quantidade de ímpares = "+contador);
        System.out.println("Média dos ímpares = "+media);
    }
}