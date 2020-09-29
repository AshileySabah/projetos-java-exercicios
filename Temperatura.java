package Exercicios17;
import java.util.Scanner;
public class Temperatura {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperaturas:");
        int qntTemperatura = input.nextInt();
        
        double temperatura;
        int i;
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        
        for(i = 1; i <= qntTemperatura; i++){
            System.out.println("Digite a temperatura:");
            temperatura = input.nextDouble();
            
            soma += temperatura;
            
            if(temperatura > maior){
                maior = temperatura;
            }
            else if(temperatura < menor){
                menor = temperatura;
            }
        }
        System.out.println("Maior = "+maior);
        System.out.println("Menor = "+menor);
        System.out.println("Média = "+(soma/qntTemperatura));
    }
}
