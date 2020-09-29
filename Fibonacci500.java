package Exercicios17;
import java.util.Scanner;
public class Fibonacci500 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;
        
        System.out.print("1 ");
        
        while(proximo < 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo+" ");   
        }
    }
}