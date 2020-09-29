package Exercicios19;
import java.util.Scanner;
public class Questao37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[A.length];
        int valor;
        int fatorial = 1;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite um valor para A:");
            valor = input.nextInt();
            A[i] = valor;
            
            for(int j = valor; j > 0; j--){
                fatorial = fatorial*j;
            }
            B[i] = fatorial;
            fatorial = 1;
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]+" | B["+i+"] = "+B[i]);
        }
    }
}
