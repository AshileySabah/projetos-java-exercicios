package Exercicios17;
import java.util.Scanner;
public class Nota{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean notaValida;
        
        do{
            System.out.println("Digite a nota: ");
            int nota = input.nextInt();
            
            if(nota > 0 && nota <= 10){
               System.out.println(nota+" é uma nota válida --> OK");
               notaValida = true;
            }
            else{
                System.out.println(nota+ " é uma nota inválida --> TENTAR DE NOVO");
                notaValida = false;
            }
        }while(notaValida != true);
    }
}
