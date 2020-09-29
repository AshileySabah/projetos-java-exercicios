package Exercicios19;
import java.util.Scanner;
public class Questao31 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [20];
        int[] vetorB = new int [vetorA.length];
        int posicaoB = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i]%2 == 0){
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            }
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i]%2 != 0){
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            }
        }

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("A["+i+"] = "+vetorA[i]+" ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < posicaoB; i++){
            System.out.print("B["+i+"] = "+vetorB[i]+" ");
        }
    }
}