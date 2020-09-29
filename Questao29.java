package Exercicios19;
import java.util.Scanner;
public class Questao29 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        int[] vetorB = new int [10];
        int[] vetorC = new int [20];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
            
            vetorC[i] = vetorA[i];
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para B:");
            vetorB[i] = input.nextInt();
            
            vetorC[vetorB.length+i] = vetorB[i];
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("A["+i+"] = "+vetorA[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print("B["+i+"] = "+vetorB[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print("C["+i+"] = "+vetorC[i]+" ");
        }
    }
}