package Exercicios17;
import java.util.Scanner;
public class Dados{
    public static void main (String[] args){
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Nome: ");
            nome = input.nextLine();
        }while(nome.length() < 4);
        
        System.out.println("Nome: "+nome);
        
        do{
            System.out.println("Idade: ");
            idade = input.nextInt();
        }while(!(idade >= 0 && idade <= 150));
        
        System.out.println("Idade: "+idade);
        
        do{
            System.out.println("Salário: ");
            salario = input.nextDouble();
        }while(salario < 0);
        
        System.out.println("Salário: "+salario);
        
        do{
            System.out.println("Sexo (F ou M): ");
            sexo = input.next();
        }while(!(sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")));
        
        System.out.println("Sexo: "+sexo);
        
        do{
            System.out.println("Estado civil: ");
            estadoCivil = input.next();
        }while(!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || 
                 estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")));
        
        System.out.println("Estado civil: "+estadoCivil);
    }
}
