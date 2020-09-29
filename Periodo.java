package Exercicios14;
import java.util.Scanner;
public class Periodo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o período em que você estuda\nM - Manhã\nV - Vespertino\nN - Noturno");
        String periodo = input.next();
        
        switch (periodo){
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Período inválido!");
        }
    } 
}
