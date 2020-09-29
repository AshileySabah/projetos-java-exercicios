package Exercicios19;
import java.util.Scanner;
public class Questao17 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int contador = 0;
        int soma = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            if(A[i] > 35){
                contador++;
            }
        }
        System.out.println("Quantidade de idades superiores a 35 = "+contador);
    }
}