package Exercicios19;
import java.util.Scanner;
public class Questao02 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[8];
        int[] B = new int[8];
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            B[i] = A[i]*2;
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]+" e B["+i+"] = "+B[i]);
        }
    }
}