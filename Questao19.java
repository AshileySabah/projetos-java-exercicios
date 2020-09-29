package Exercicios19;
import java.util.Scanner;
public class Questao19 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int[] Notas1 = new int[10];
        int[] Notas2 = new int[10];
        double[] Result = new double[10];

        for(int i = 0; i < Notas1.length; i++){
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            Notas1[i] = input.nextInt();
            
            System.out.println("Digite o "+(i+1)+"º elemento de A:");
            Notas2[i] = input.nextInt();
        }
        
        for(int i = 0; i < Notas1.length; i++){
            Result[i] = (double)(Notas1[i]+Notas2[i])/2;
            
            System.out.print("Notas1 = "+Notas1[i]+" \n");
            System.out.print("Notas2 = "+Notas2[i]+" \n");
            System.out.print("Result = "+Result[i]+" \n");
            
            if(Result[i] >= 7){
                System.out.println("APROVADO");
            }
            else{
                System.out.println("REPROVADO");
            }
        }
    }
}