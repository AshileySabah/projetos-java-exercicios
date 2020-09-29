package Exercicios17;
import java.util.Scanner;
public class Intervalo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Digite o primeiro número");
        int num1 = input.nextInt();
        System.out.println(" Digite o primeiro número");
        int num2 = input.nextInt();
        
        int i;
        
        for(i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }
}