package Exercicios13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Pescador {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite quantos quilos de peixe foram pescados: ");
        double quilosPeixesPescados = input.nextDouble();
        if(quilosPeixesPescados > 50){
            double excesso = quilosPeixesPescados-50;
            DecimalFormat formatador = new DecimalFormat("0.00");//serve para deixar com 2 casa decimais
            System.out.println("Excedeu em "+formatador.format(excesso)+"kg");
            int auxValor = (int)excesso;
            int multa = auxValor*4;
            System.out.println("Multa no valor de R$"+multa+",00");
        }
        else{
            System.out.println("Não há multa");
        }
    }
}
