package Exercicios17;
import java.util.Scanner;
public class TabuadaSeletiva {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite de qual número é a tabuada:");
        int numTabuada = input.nextInt();
        
        boolean invalido;
        int i;
        
        int numComecar;
        int numTerminar;
        
        do{
            System.out.println("A partir de qual número começar?");
            numComecar = input.nextInt();

            System.out.println("A partir de qual número terminar?");
            numTerminar = input.nextInt();
            
            if(numComecar > numTerminar){
                System.out.println("O valor para começar deve ser menor do que o valor de terminar");
                invalido = true;
            }
            else{
                invalido = false;
            }
        
        }while(invalido == true);
        
        System.out.println("Começou com: "+numComecar);
        System.out.println("Terminou com: "+numTerminar);
        System.out.println("Tabuada de: "+numTabuada);
        
        for(i = numComecar; i <= numTerminar; i++){
            System.out.println(numTabuada+" x "+i+" = "+(numTabuada*i));
        }

    }
}
