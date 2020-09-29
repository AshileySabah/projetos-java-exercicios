package Exercicios14;
import java.util.Scanner;
public class NotasConceito {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as duas notas: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double media = (nota1+nota2)/2;
        if(media >= 9 && media <= 10){
            System.out.println("Notas: "+nota1+" e "+nota2);
            System.out.println("Média: "+media);
            System.out.println("Conceito: A");
            System.out.println("Situação: Aprovado");
        }
        else if(media >= 7.5 && media < 9){
            System.out.println("Notas: "+nota1+" e "+nota2);
            System.out.println("Média: "+media);
            System.out.println("Conceito: B");
            System.out.println("Situação: Aprovado");
        }
        else if(media >= 6 && media < 7.5){
            System.out.println("Notas: "+nota1+" e "+nota2);
            System.out.println("Média: "+media);
            System.out.println("Conceito: C");
            System.out.println("Situação: Aprovado");
        }
        else if(media >= 4 && media < 6){
            System.out.println("Notas: "+nota1+" e "+nota2);
            System.out.println("Média: "+media);
            System.out.println("Conceito: D");
            System.out.println("Situação: Reprovado");
        }
        else if(media < 4 && media >= 0){
            System.out.println("Notas: "+nota1+" e "+nota2);
            System.out.println("Média: "+media);
            System.out.println("Conceito: E");
            System.out.println("Situação: Reprovado");
        }
        else{
            System.out.println("Verifique as notas digitadas");
        }
    } 
}
