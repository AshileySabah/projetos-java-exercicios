package Exercicios17;
import java.util.Scanner;
public class Primos2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = input.nextInt();
        int i;
        int j;
        
        boolean primo;
        
        for(i = 1; i <= num; i++){
            
            primo = true;
            
            for(j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                }
            }
            
            if(primo){
                System.out.println(i);
            }
        }
    }
}
