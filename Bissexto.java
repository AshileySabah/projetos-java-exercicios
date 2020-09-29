package Exercicios14;
import java.util.Scanner;
public class Bissexto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();
        if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
            System.out.println(ano+" é um ano Bissexto!");
        }
        else{
            System.out.println(ano+" não é um ano Bissexto!");
        }
    }
}
