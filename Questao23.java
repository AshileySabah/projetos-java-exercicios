package Exercicios19;
import java.util.Scanner;
public class Questao23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for(int i = 0; i <= vetorA.length; i++){
            System.out.println("Digite um valor inteiro:");
            vetorA[i] = input.nextInt();
            if(vetorA[i]%2 != 0){
                break;
            }
        }
    }
}
