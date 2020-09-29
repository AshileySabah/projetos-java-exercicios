package Exercicios19;
import java.util.Scanner;
public class Questao18 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];
        int idadeMaior = Integer.MIN_VALUE;
        int idadeMenor = Integer.MAX_VALUE;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            A[i] = input.nextInt();
            
            if(A[i] > idadeMaior){
                idadeMaior = A[i];
                posicaoMaior = i;
            }
            if(A[i] < idadeMenor){
                idadeMenor = A[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Idade Maior= "+idadeMaior+" Posição = "+posicaoMaior);
        System.out.println("Idade Menor= "+idadeMenor+" Posição = "+posicaoMenor);
    }
}