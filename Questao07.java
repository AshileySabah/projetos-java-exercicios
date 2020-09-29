package Exercicios19;
import java.util.Scanner;
public class Questao07 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            System.out.println("Digite o "+(i+1)+"º elemento de B:");
            B[i] = input.nextInt();
            
            C[i] = A[i] - B[i];
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]+" * B["+i+"] = "+B[i]+" = C["+i+"] = "+C[i]);
        }
    }
}