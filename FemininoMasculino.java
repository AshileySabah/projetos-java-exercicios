package Exercicios14;
import java.util.Scanner;
public class FemininoMasculino {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 'F' ou 'M'");
        String sexo = input.next();        
        if(sexo.equals("F")||sexo.equals("f")){
            System.out.println("Feminino");
        }
        else if (sexo.equals("M")||sexo.equals("m")){
            System.out.println("Masculino");
        }
        else{
            System.out.println("Sexo inválido");
        }
    }
}