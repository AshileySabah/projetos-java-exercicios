package Exercicios19;
import java.util.Scanner;
public class Questao25 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        int[] vetorB = new int [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
            
            if(vetorA[i]%2 == 0){
                vetorB[i] = 1;
            }
            else{
                vetorB[i] = 0;
            }   
        }
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("A["+i+"] = "+vetorA[i]);
        }
        System.out.println("");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("B["+i+"] = "+vetorB[i]);
        }
    }
}