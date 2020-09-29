package Exercicios17;
import java.util.Scanner;
public class Loja3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i = 1;
        double precoProduto;
        double total = 0;
        boolean continuar = true;
        String resposta;
        boolean decisao = false;
        
        
        do{
            System.out.println("Produto "+i+": ");
            precoProduto = input.nextDouble();
            i++;
            total += precoProduto;
            
            do{
                if(precoProduto == 0){
                    System.out.println("Deseja mesmo acabar? (S/N)");
                    resposta = input.next();

                    if(resposta.equalsIgnoreCase("s")){
                        continuar = false;
                    }
                    else if(resposta.equalsIgnoreCase("n")){
                        continuar = true;
                    }
                    else{
                        System.out.println("Decisão inválida!");
                        decisao = false;
                    }
                }
                else{
                    continuar = true;
                    decisao = true;
                }
            }while(decisao == false);
            
        }while(continuar == true);
        System.out.println("Total = "+total);
        System.out.println("Quantidade de produtos = "+(i-1));
    }
}