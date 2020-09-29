package Exercicios14;
import java.util.Scanner;
public class Salario {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        double salario = input.nextDouble();
        if(salario > 0 && salario <= 280){
            double porcentagem = 20/100;
            double novoSalario = salario*porcentagem + salario;
            System.out.println("Novo salario: R$"+novoSalario);
        }
        else if(salario > 280 && salario < 700){
            double porcentagem = 15/100;
            double novoSalario = salario*porcentagem + salario;
            System.out.println("Novo salario: R$"+novoSalario);  
        }
        else if(salario >= 700 && salario < 1500){
            double porcentagem = 10/100;
            double novoSalario = salario*porcentagem + salario;
            System.out.println("Novo salario: R$"+novoSalario);  
        }
        else if(salario >= 1500){
            double porcentagem = 5/100;
            double novoSalario = salario*porcentagem + salario;
            System.out.println("Novo salario: R$"+novoSalario);  
        }
    }
}
