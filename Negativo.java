package Exercicios14;
import java.util.Scanner;
public class Negativo {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = input.nextInt();
        if(num1<0){
            System.out.println(num1+" é negativo");
        }
        else{
            System.out.println(num1+" é positivo");
        }
    }
}
