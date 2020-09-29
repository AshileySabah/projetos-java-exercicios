package Exercicios17;
import java.util.Scanner;
public class Potencia {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Base: ");
        int base = input.nextInt();
        System.out.println("Expoente: ");
        int expoente = input.nextInt();
        
        int conta = base;
        
        for(int i=1; i < expoente; i++){
            conta *= base;
        }
        System.out.println("conta: "+conta);
    }
}