package Exercicios14;
import java.util.Scanner;
public class ParImpar {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println(num+" é par");
        }
        else{
            System.out.println(num+" é ímpar");
        }
    }
}