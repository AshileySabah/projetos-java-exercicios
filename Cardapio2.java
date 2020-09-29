package Exercicios17;
import java.util.Scanner;
public class Cardapio2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int codigo;
        int qnt;
        
        double total = 0;
        
        String output = "";
        
        boolean continuar = true;
        
        do{
            System.out.println("Digite o código (0 - Sair):");
            codigo = input.nextInt();

            if(codigo == 0){
                continuar = false;
            }
            else{
                if(codigo == 100){
                    System.out.println("Cachorro Quente - UN. R$1,20");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Cachorro quente - R$1,20 * "+qnt+" = "+(1.20*qnt)+"\n";
                    total += qnt*1.20;
                }
                else if(codigo == 101){
                    System.out.println("Bauru Simples - UN. R$1,30");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Bauru Simples - R$1,30 * "+qnt+" = "+(1.30*qnt)+"\n";
                    total += qnt*1.30;
                }
                else if(codigo == 102){
                    System.out.println("Bauru com Ovo - UN. R$1,50");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Bauru Simples - R$1,50 * "+qnt+" = "+(1.50*qnt)+"\n";
                    total += qnt*1.50;
                }
                else if(codigo == 103){
                    System.out.println("Hambúrguer - UN. R$1,20");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Hambúrguer - R$1,20 * "+qnt+" = "+(1.20*qnt)+"\n";
                    total += qnt*1.20;
                }
                else if(codigo == 104){
                    System.out.println("Cheeseburguer - UN. R$1,30");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Cheeseburguer - R$1,30 * "+qnt+" = "+(1.30*qnt)+"\n";
                    total += qnt*1.30;
                }
                else if(codigo == 105){
                    System.out.println("Refrigerante - UN. R$1,00");
                    System.out.println("Digite a quantidade:");
                    qnt = input.nextInt();
                    output += "Refrigerante - R$1,00 * "+qnt+" = "+(1.00*qnt)+"\n";
                    total += qnt*1.00;
                }
                else if(codigo == 0){
                    System.out.println("GERANDO NOTA ........");
                    continuar = false;
                }
                else{
                    System.out.println("CÓDIGO INVÁLIDO");
                }  
            }
        }while(continuar == true);
        
        output += "Total = R$"+total;
        System.out.println(output);

    }
}
