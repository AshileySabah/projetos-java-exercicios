package Exercicios19;
import java.util.Scanner;
public class Questao24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro:");
            vetorA[i] = input.nextInt();
        }
        
        boolean palindromo = true;
        for(int i = 0; i <= (vetorA.length/2); i++){
            if(vetorA[i] != vetorA[vetorA.length-1-i]){
                palindromo = false;
                break;
            }
        }
        System.out.println("Palíndromo: "+palindromo);
    }
}
