package Exercicios17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SerieSoma2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        DecimalFormat corrigir = new DecimalFormat("0.00");
        System.out.println("Digite o valor de n:");
        int num = input.nextInt();
        
        double soma = 0;
        
        int i;
        int j;
        
        System.out.print("S = ");
        for(i = 1, j = 1; i <= num; i++, j += 2){
            System.out.print(i+"/"+j+" + ");
            soma += (double)i/j;
        }
        System.out.print(" 0 = "+corrigir.format(soma));
    }
}
