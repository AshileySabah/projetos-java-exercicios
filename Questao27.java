package Exercicios19;
import java.util.Scanner;
public class Questao27 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        char[] vetorB = new char [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
            
            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            }
            if(vetorA[i] == 7){
                vetorB[i] = 'b';
            }
            if(vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            }
            if(vetorA[i] == 10){
                vetorB[i] = 'd';
            }
            if(vetorA[i] > 10){
                vetorB[i] = 'e';
            }
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("A["+i+"] = "+vetorA[i]);
            System.out.println("B["+i+"] = "+vetorB[i]);
            System.out.println("");
        }
    }
}