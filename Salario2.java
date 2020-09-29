package Exercicios14;
import java.util.Scanner;
public class Salario2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da hora: ");
        double valorHora = input.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasMes = input.nextDouble();
        double salarioBruto = valorHora*horasMes;
        double impostoRenda;
        
        if(salarioBruto <= 900){
            System.out.println("Isento de IR");
        }
        else if(salarioBruto > 900 && salarioBruto <= 1500){
            impostoRenda = 0.5*salarioBruto;
            System.out.println("IR: "+impostoRenda);
        }
        else if(salarioBruto <= 2500){
            impostoRenda = 0.10*salarioBruto;
            System.out.println("IR: "+impostoRenda);
        }
        else if(salarioBruto > 2500){
            impostoRenda = 0.20*salarioBruto;
            System.out.println("IR: "+impostoRenda);
        }
        
        double inss = 0.10*salarioBruto;
        double fgts = 0.11*salarioBruto;
        double totalDeDescontos = inss+fgts;
        double salarioLiquido = salarioBruto-totalDeDescontos;
        System.out.println("Salário Bruto: "+salarioBruto);
        System.out.println("INSS: "+inss);
        System.out.println("FGTS: "+fgts);
        System.out.println("Total de descontos: "+totalDeDescontos);
        System.out.println("Salário Líquido: "+salarioLiquido);
    } 
}
