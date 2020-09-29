package Exercicios19;
import java.util.Scanner;
public class Questao34 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
       
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro para A:");
            vetorA[i] = input.nextInt();
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i]%2 == 0){
                System.out.println(vetorA[i]+" é par e está na posição "+i);
            }
        }
    }
}