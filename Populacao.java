package Exercicios17;
import java.text.DecimalFormat;
public class Populacao{
    public static void main (String[] args){
        DecimalFormat formatador = new DecimalFormat("0");
        
        double popA = 80000;    //acho que fica mais correto usar o double
        double popB = 200000;   //por que o numero fica mais próximo
        
        double taxaA = (double)3/100;
        double taxaB = 1.5/100;
        
        int cont = 0;
                
        while(popA < popB){
            popA += popA*taxaA;
            popB += popB*taxaB;
            cont++;
        }
        System.out.println(formatador.format(popA));
        System.out.println(formatador.format(popB));
        System.out.println(cont);
    }
}