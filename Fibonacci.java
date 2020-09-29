package Exercicios17;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        
        int num = input.nextInt();
        
        int primeiro = 0;
        int segundo = 1;
        int proximo;
        
        System.out.print("1 ");
        for(int i = 1; i <= num; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo+" ");
        }
    }
}