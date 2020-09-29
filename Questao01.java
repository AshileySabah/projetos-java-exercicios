package Exercicios19;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            B[i] = A[i];
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println(" O "+(i+1)+"º elemento de A é "+A[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < B.length; i++){
            System.out.println(" O "+(i+1)+"º elemento de B é "+B[i]);
        }
    }
}
