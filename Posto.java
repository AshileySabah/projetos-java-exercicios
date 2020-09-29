package Exercicios14;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Posto {
    public static void main (String[]args){
        double alcool = 1.90;
        double gasolina = 2.50;
        
        DecimalFormat formatar = new DecimalFormat();
        Scanner input = new Scanner(System.in);
        
        System.out.println("A - Álcool\nG - Gasolina\nResposta:");
        String combustivel = input.next();
        
        switch(combustivel){
            case "a":
            case "A": System.out.println("Quantos litros?");
                double litrosAlcool = input.nextDouble();
                    if(litrosAlcool > 0 && litrosAlcool <= 20){                        
                        double precoAlcool = alcool*litrosAlcool;
                        double precoAlcoolNovo = precoAlcool-precoAlcool*0.03;
                        System.out.println("Preço do álcool sem desconto: "+formatar.format(precoAlcool));
                        System.out.println("Preço do álcool com desconto: "+formatar.format(precoAlcoolNovo));
                    }
                    else if(litrosAlcool > 20){
                        double precoAlcool = alcool*litrosAlcool;
                        double precoAlcoolNovo = precoAlcool-precoAlcool*0.05;
                        System.out.println("Preço do álcool sem desconto: "+formatar.format(precoAlcool));
                        System.out.println("Preço do álcool com desconto: "+formatar.format(precoAlcoolNovo));  
                    }
                break;
            case "g":
            case "G": System.out.println("Quantos litros?");
                double litrosGasolina = input.nextDouble();
                    if(litrosGasolina > 0 && litrosGasolina <= 20){                        
                        double precoGasolina = gasolina*litrosGasolina;
                        double precoGasolinaNovo = precoGasolina-precoGasolina*0.04;
                        System.out.println("Preço do álcool sem desconto: "+precoGasolina);
                        System.out.println("Preço do álcool com desconto: "+precoGasolinaNovo);
                    }
                    else if(litrosGasolina > 20){
                        double precoGasolina = gasolina*litrosGasolina;
                        double precoGasolinaNovo = precoGasolina-precoGasolina*0.06;
                        System.out.println("Preço do álcool sem desconto: "+formatar.format(precoGasolina));
                        System.out.println("Preço do álcool com desconto: "+formatar.format(precoGasolinaNovo)); 
                    }
                break;
            default: System.out.println("Opção inválida!"); break;
        }
    }
}