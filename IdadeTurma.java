package Exercicios17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class IdadeTurma {
    public static void main(String[]args){
        double soma = 0;
        double media;
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        int qntTurma = input.nextInt();
        for(int i = 1; i <= qntTurma; i++){
            System.out.println("Digite a "+i+"ª idade:");
            double idade = input.nextDouble();
            soma += idade;
        }
        media = soma/qntTurma;
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+formatador.format(media));
        
        if(media <= 25){
            System.out.println("JOVEM");
        }
        else if(media > 26 && media < 60){
            System.out.println("ADULTO");
        }
        else{
            System.out.println("IDOSO");
        }
    }
}