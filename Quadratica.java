package Exercicios14;
import java.util.Scanner;
public class Quadratica{
    public static void main (String[] args){
        System.out.println("Modelo --> ax² + bx + c");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a: ");
        double a = input.nextDouble();
        System.out.println("Digite b: ");
        double b = input.nextDouble();
        System.out.println("Digite c: ");
        double c = input.nextDouble();
        
        double delta2 = b*b;
        double delta3 = 4*a*c;
        double delta = delta2 - delta3;
        double raizDelta = Math.sqrt(delta);
        
        double raizUm = (-b + raizDelta)/(2*a);
        double raizDois = (-b - raizDelta)/(2*a);
        
        if(delta < 0){
            System.out.println("Não há raíz real");
        }
        else if(delta == 0){
            System.out.println("Há uma raíz real");
            System.out.println(raizUm);
        }
        else if(delta > 0){
            System.out.println("Há duas raízes reais");
            System.out.println(raizUm);
            System.out.println(raizDois);
        }
    }
}
