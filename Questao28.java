package Exercicios19;
import java.util.Scanner;
public class Questao28 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        int[] vetorB = new int [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
            
            vetorB[vetorB.length-i-1] = vetorA[i];
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("A["+i+"] = "+vetorA[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("B["+i+"] = "+vetorB[i]+" ");
        }
    }
}