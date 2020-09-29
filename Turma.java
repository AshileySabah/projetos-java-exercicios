package Exercicios17;
import java.util.Scanner;
public class Turma {
    public static void main (String[]args){
        int pessoasTurma;
        int soma = 0;
        double media;
        boolean invalido;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas turmas?");
        int qntTurmas = input.nextInt();
        for(int i = 1; i <= qntTurmas; i++){
            invalido = true;
            do{
                System.out.println("Quantas pessoas na turma "+i);
                pessoasTurma = input.nextInt();
                if(pessoasTurma <= 40){
                    invalido = false;
                }
                else{
                    System.out.println("Quantidade inválida");
                }
            }while(invalido);
            soma += pessoasTurma;
        }
        media = soma/qntTurmas;
        System.out.println("Soma = "+soma);
        System.out.println("Número médio aproximado de pessoas nas turmas "+media);
    }
}