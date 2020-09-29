package Exercicios19;
import java.util.Scanner;
public class Questao16 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int contadorIgual15 = 0;
        int somaMenores15 = 0;
        int somaMaiores15 = 0;
        int contadorMaior15 = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            if(A[i] < 15){
                somaMenores15 += A[i];
            }
            else if(A[i] == 15){
                contadorIgual15++;
            }
            else if(A[i] > 15){
                somaMaiores15 += A[i];
                contadorMaior15++;
            }
        }
        
        double mediaMaiores15 = (double) somaMaiores15/contadorMaior15;
       
        System.out.println("Media maiores de 15 = "+mediaMaiores15);
        System.out.println("Soma menores de 15 = "+somaMenores15);
        System.out.println("Quantidade igual a 15 = "+contadorIgual15);
    }
}