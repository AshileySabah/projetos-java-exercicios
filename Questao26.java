package Exercicios19;
import java.util.Scanner;
public class Questao26 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        int[] vetorB = new int [10];
        int[] vetorC = new int [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
            
            System.out.println("Digite um valor inteiro para B:");
            vetorB[i] = input.nextInt();
            
            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }
            if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }
            if(vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("A["+i+"] = "+vetorA[i]);
            System.out.println("B["+i+"] = "+vetorB[i]);
            System.out.println("C["+i+"] = "+vetorC[i]);
            System.out.println("");
        }
    }
}