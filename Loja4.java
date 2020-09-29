package Exercicios17;
import java.util.Scanner;
public class Loja4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        boolean sair = false;
        String fazerCompra;
        int qntProdutos;
        double precoProduto;
        double total;
        String output;
        double valorRecebido;
        double troco;
        
        do{
            System.out.println("Deseja iniciar nova compra? (S/N)");
            fazerCompra = input.next();
            
            if(fazerCompra.equalsIgnoreCase("s")){
                output = "Lojas Tabajara\n";
                
                System.out.println("Digite a quantidade de produtos: ");
                qntProdutos = input.nextInt();
                
                
                total = 0;
                
                for(int i = 1; i <= qntProdutos; i++){
                    System.out.println("Preço do produto "+i+": ");
                    precoProduto = input.nextDouble();
                    
                    total += precoProduto;
                    output += "Produto "+i+" - Preço = "+precoProduto+"\n";
                }
                
                output += "Total = R$"+total;
                
                System.out.println("Total R$"+total);
                System.out.println("Entre com o valor recebido: ");
                
                valorRecebido = input.nextDouble();
                troco = valorRecebido - total;
                
                output += "Dinheiro R$"+valorRecebido+"\n";
                output += "Troco R$"+troco+"\n";
                
                System.out.println(output);
            }
            else{
                sair = true;
            }
        }while(!sair);
        
    }
}
