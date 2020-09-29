package Exercicios13;
import java.util.Scanner;
public class SalarioMes {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.println("Horas trabalhadas no mês: ");
        double horaMes = input.nextDouble();
        
        double salario = valorHora*horaMes;
        System.out.println("O salário no mês é "+salario);
    }
}
