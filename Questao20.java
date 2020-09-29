package Exercicios19;
import java.util.Scanner;
public class Questao20 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        double[] vetorA = new double[20];
        double cotacao;
        
        System.out.println("Digite o valor da cotação:");
        cotacao = input.nextDouble();
        
        
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao*(i+1);
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Valor: "+vetorA[i]);
        }
    }
}