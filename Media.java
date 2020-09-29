package Exercicios17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Media {
    public static void main (String[]args){
        double nota;
        double soma = 0;
        double media;
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite quantas notas:");
        int qntNotas = input.nextInt();
        
        
        for(int i = 1; i <= qntNotas; i++){
            System.out.println("Digite a "+i+"ª nota: ");
            nota = input.nextDouble();
            soma += nota;
        }
        System.out.println("Soma: "+soma);
        media = soma/qntNotas;
        System.out.println("Média: "+formatador.format(media));
    }
}
