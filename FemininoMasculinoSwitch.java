package Exercicios14;
import java.util.Scanner;
public class FemininoMasculinoSwitch {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 'F' ou 'M'");
        String sexo = input.next();        
        switch (sexo) {
            case "F":
            case "f":
                System.out.println("Feminino");
                break;
            case "M":
            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}