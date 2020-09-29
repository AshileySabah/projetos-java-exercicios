package Exercicios19;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Questao04 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        DecimalFormat corrigir = new DecimalFormat("0.00");
        
        int[] A = new int[15];
        double[] B = new double[15];
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            B[i] = sqrt(A[i]);
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]+" e B["+i+"] = "+corrigir.format(B[i]));
        }
    }
}