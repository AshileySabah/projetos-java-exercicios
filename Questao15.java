package Exercicios19;
import java.util.Scanner;
public class Questao15 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int contadorPares = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            if(A[i]%2 == 0){
                contadorPares++;
            }
        }
        
        int contadorImpares = A.length-contadorPares;
        
        double porcentagemPar = (double)(contadorPares*100)/A.length;
        double porcentagemImpar = 100 - porcentagemPar;
        
        
        System.out.println("Quantidade de pares = "+contadorPares);
        System.out.println("Quantidade de ímpares = "+contadorImpares);
        System.out.println("Porcentagem de pares = "+porcentagemPar);
        System.out.println("Porcentagem de ímpares = "+porcentagemImpar);
    }
}