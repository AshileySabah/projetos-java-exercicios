package Exercicios14;
import java.util.Scanner;
public class Numeros {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o 1º e o segundo número: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println(num1+" é maior do que "+num2);
        }
        else{
            System.out.println(num2+" é maior do que "+num1);
        }
    }
}
