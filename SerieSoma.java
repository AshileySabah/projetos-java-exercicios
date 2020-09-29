package Exercicios17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SerieSoma {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        DecimalFormat corrigir = new DecimalFormat("0.00");
        System.out.println("Digite o valor de n:");
        int num = input.nextInt();
        
        double total = 0;
        
        int i;
        int j;
        
        for(i = 1, j = 1; j <= num; j++){
            System.out.print(i+"/"+j+" + ");
            total += (double)i/j;
        }
        System.out.print(" 0 = "+corrigir.format(total));
    }
}
