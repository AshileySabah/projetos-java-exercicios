package Exercicios17;
import java.util.Scanner;
public class Primos {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = input.nextInt();
        boolean primo = true;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Não é primo - disivível por "+i);
                primo = false;
            }
        }
        if(primo){
            System.out.println("É primo");
        }
    }
}