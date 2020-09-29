package Exercicios19;
import java.util.Scanner;
public class Questao32 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [5];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite os valores:");
            vetorA[i] = input.nextInt();
        }
        
        for(int i = 0; i < vetorA.length; i++){
            for(int j = 0; j <=10; j++){
                System.out.println(vetorA[i]+" x "+j+" = "+(vetorA[i]*j));
            }
            System.out.println("");
        }
    }
}