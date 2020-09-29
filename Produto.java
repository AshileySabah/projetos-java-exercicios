package Exercicios14;
import java.util.Scanner;
public class Produto {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor dos 3 produtos: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if(num1 != num2 && num2 != num3 && num1 != num3){
            if(num1 < num2 && num1 < num3){
                System.out.println("Comprar produto 1");
            }
            else if(num2 < num3 && num2 < num3){
                System.out.println("Comprar produto 2");
            }
            else{
                System.out.println("Comprar produto 3");
            }
        }
        
        else if(num1 == num2 && num1 != num3){
            if(num1 < num3){
                System.out.println("Comprar produto 1 ou 2");
            }
            else{
                System.out.println("Comprar produto 3");
            }
        }
        
        else if(num1 == num3 && num1 != num2){
            if(num1 < num2){
                System.out.println("Comprar produto 1 ou 3");
            }
            else{
                System.out.println("Comprar produto 2");
            }
        }
        
        else if(num2 == num3 && num2 != num1){
            if(num2 < num1){
                System.out.println("Comprar produto 2 ou 3");
            }
            else{
                System.out.println("Comprar produto 1");
            }
        }
        
        else{
            System.out.println("Todos têm o mesmo valor");
        }
    }     
} 