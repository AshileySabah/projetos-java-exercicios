package Exercicios14;
import java.util.Scanner;
public class MediaAluno {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1ª e a 2ª nota: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double media = (nota1+nota2)/2;
        if(media == 10){
            System.out.println("Aprovado com distinção!");
        }
        else if(media >= 7){
            System.out.println("Média "+media+", aprovado");
        }
        else{
            System.out.println("Média "+media+", reprovado");
        }
    } 
}
