package Exercicios19;
import java.util.Scanner;
public class Questao33 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        boolean primo = true;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor para A:");
            vetorA[i] = input.nextInt();
        }
        
        for(int i = 0; i < vetorA.length; i++){
            for(int j = 2; j < vetorA[i]; j++){
                primo = true;
                if(vetorA[i]%j == 0){
                    primo = false;
                    break;
                }
            }
            
            String msg;
            if(primo == true){
                msg = " é primo ";
            }
            else{
                msg = " não é primo ";
            }
            
            System.out.println(vetorA[i]+msg);
        }
    }
}