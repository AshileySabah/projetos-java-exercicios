package Exercicios17;
import java.util.Scanner;
public class CDs {
    public static void main (String[]args){
        double preco;
        double soma = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de CDs:");
        int qntCDs = input.nextInt();
        
        for(int i = 1; i <= qntCDs; i++){
            System.out.println("Preço do CD "+i);
            preco = input.nextDouble();
            soma += preco;
        }
        System.out.println("Preço total: R$"+soma);
    }
}