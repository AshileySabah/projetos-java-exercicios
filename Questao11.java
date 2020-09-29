package Exercicios19;
import java.util.Scanner;
public class Questao11 {
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
        
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"] = "+A[i]);
        }
        System.out.println("Quantidade de pares: "+contadorPares);
    }
}