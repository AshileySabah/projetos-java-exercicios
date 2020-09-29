package Exercicios17;
import java.util.Scanner;
public class Serie {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de n:");
        int num = input.nextInt();
        
        int i;
        int j;
        
        System.out.print("S = ");
        for(i = 1, j = 1; i <= num; i++, j += 2){
            System.out.print(i+"/"+j+" + ");
        }
    }
}
