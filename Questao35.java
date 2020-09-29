package Exercicios19;
import java.util.Scanner;
public class Questao35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] A = new int [10];
        int valor;
        
        for(int i = 0; i < A.length; i++){
            System.out.println("Digite um valor para A:");
            valor = input.nextInt();
            
            for(int j = 1; j <= valor; j++){
                if(valor%j == 0){
                    System.out.println(valor+" é divisível por "+j);
                }
            }
        }
    }
}
