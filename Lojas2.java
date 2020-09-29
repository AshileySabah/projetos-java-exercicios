package Exercicios17;
import java.util.Scanner;
public class Lojas2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        double precoProduto;
        double soma = 0;
        boolean continua;
        double nota;
        double troco;
        
        do{
            i++;
            System.out.println("Preço do produto "+i+": ");
            precoProduto = input.nextDouble();
            soma += precoProduto;
            continua = precoProduto != 0;
        }while(continua == true);
        System.out.println("Quantidade de produtos = "+(i-1));
        System.out.println("Total = "+soma);
        
        System.out.println("Nota para o troco: ");
        nota = input.nextDouble();
        
        troco = nota - soma;
        
        System.out.println("Nota para o troco: "+troco);
    }
}
