package Exercicios14;
import java.util.Scanner;
public class Crime {
    public static void main (String[]args){
        int contador = 0;
        Scanner input = new Scanner(System.in);
        //-----------------------------------------------------------//
        System.out.println("Telefonou para a vítima?\nN - não\nS - sim\nResposta abaixo:");
        
        String telefonar = input.next();
        switch(telefonar){
            case "n":
            case "N": break;
            case "s":
            case "S": contador++; break;
            default: System.out.println("Valor inválido!");
        }
        //-----------------------------------------------------------//
        System.out.println("\nEsteve no local do crime?\nN - não\nS - sim\nResposta abaixo:");
        
        String local = input.next();
        switch(local){
            case "n":
            case "N": break;
            case "s":
            case "S": contador++; break;
            default: System.out.println("Valor inválido!");
        }
        //-----------------------------------------------------------//
        System.out.println("\nMora perto da vítima?\nN - não\nS - sim\nResposta abaixo:");
        
        String morar = input.next();
        switch(morar){
            case "n":
            case "N": break;
            case "s":
            case "S": contador++; break;
            default: System.out.println("Valor inválido!");
            
        }
        //-----------------------------------------------------------//
        System.out.println("\nDevia para a vítima?\nN - não\nS - sim\nResposta abaixo:");
        
        String dever = input.next();
        switch(dever){
            case "n":
            case "N": break;
            case "s":
            case "S": contador++; break;
            default: System.out.println("Valor inválido!");
        }
        //-----------------------------------------------------------//
        System.out.println("\nJá trabalhou com a vítima?\nN - não\nS - sim\nResposta abaixo:");
        
        String trabalhar = input.next();
        switch(trabalhar){
            case "n":
            case "N": break;
            case "s":
            case "S": contador++; break;
            default: System.out.println("Valor inválido!");
        }
        //-----------------------------------------------------------//
        
        if(contador == 2){
            System.out.println("Suspeita");
        }
        else if(contador > 2 && contador < 5){
            System.out.println("Cúmplice");
        }
        else if(contador == 5){
            System.out.println("Assassino");
        }
        else{
            System.out.println("Inocente");
        }
    }
}