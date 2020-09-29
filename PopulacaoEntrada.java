package Exercicios17;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PopulacaoEntrada{
    public static void main (String[] args){
        DecimalFormat formatador = new DecimalFormat("0");
        Scanner input = new Scanner(System.in);
        
        double popA;
        double popB;
        
        double taxaA;
        double taxaB;
        
        double auxA;
        double auxB;
        
        int cont = 0;
        
        
        boolean check;
        
        do{
            System.out.println("População A: ");
            popA = input.nextDouble();
            if(popA > 0){
                System.out.println("População A: "+popA);
                check = true;
            }
            else{
                System.out.println("Digite novamente.");
                check = false;
            }
        }while(check == false);
        
        do{
            System.out.println("População B: ");
            popB = input.nextDouble();
            if(popB > 0){
                System.out.println("População A: "+popB);
                check = true;
            }
            else{
                System.out.println("Digite novamente.");
                check = false;
            }
        }while(check == false);
        
        do{
            System.out.println("Taxa A: ");
            taxaA = input.nextDouble();
            if(taxaA > 0){
                System.out.println("Taxa A: "+taxaA);
                check = true;
            }
            else{
                System.out.println("Digite novamente.");
                check = false;
            }
        }while(check == false);
        
        do{
            System.out.println("Taxa B: ");
            taxaB = input.nextDouble();
            if(taxaB > 0){
                System.out.println("Taxa B: "+taxaB);
                check = true;
            }
            else{
                System.out.println("Digite novamente.");
                check = false;
            }
        }while(check == false);
        
        auxA = (double) taxaA/100;
        auxB = (double) taxaB/100;
        
        while(popA < popB){
            popA = popA + popA*auxA;
            popB = popB + popB*auxB;
            cont++;
        }
        System.out.println("A: "+formatador.format(popA));
        System.out.println("B: "+formatador.format(popB));
        System.out.println("Anos: "+cont);
    }
}