package Exercicios14;
import java.util.Scanner;
public class NumeroOperacao {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o 2º número: ");
        double num2 = input.nextDouble();
        
        System.out.println("Digite a operação:\n'+' - somar\n'-' - subtrair\n'/' - dividir\n'*' - multiplicar");
        String operacao = input.next();
        
        double soma = num1+num2;
        double subtrair = num1-num2;
        double multiplicar = num1*num2;
        double dividir = num1/num2;
        
        boolean parSoma = soma%2 == 0;
        boolean parSubtrair = subtrair%2 == 0;
        boolean parMultiplicar = multiplicar%2 == 0;
        boolean parDividir = dividir%2 == 0;
        
        switch(operacao){
            case "+":
               System.out.println(num1+"+"+num2+"="+soma);
               if(parSoma){
                   System.out.println("O resultado é par");
               }
               else{
                   System.out.println("O resultado é ímpar");
               }
               break;
            case "-":
               System.out.println(num1+"-"+num2+"="+subtrair);
               if(parSubtrair){
                   System.out.println("O resultado é par");
               }
               else{
                   System.out.println("O resultado é ímpar");
               }
               break;
            case "*":
               System.out.println(num1+"*"+num2+"="+multiplicar);
               if(parMultiplicar){
                   System.out.println("O resultado é par");
               }
               else{
                   System.out.println("O resultado é ímpar");
               }
               break;
            case "/":
               System.out.println(num1+"/"+num2+"="+dividir);
               if(parDividir){
                   System.out.println("O resultado é par");
               }
               else{
                   System.out.println("O resultado é ímpar");
               }
               break;
        }
    }
}