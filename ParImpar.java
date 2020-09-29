package Exercicios17;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int i;
        int num;
        int par = 0;
        int impar = 0;
        
        for(i = 1; i <= 10; i++){
            System.out.println("Digite um número");
            num = input.nextInt();
            
            if(num%2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("par = "+par);
        System.out.println("ímpar = "+impar);
    }
}
