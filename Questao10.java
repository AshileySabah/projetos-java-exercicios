package Exercicios19;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Questao10 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        DecimalFormat corrigir = new DecimalFormat("0.00");
        
        int[] A = new int[10];
        double[] B = new double[10];
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            B[i] = (double) A[i]%2;
            
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]+" * B["+i+"] = "+B[i]);
        }
    }
}