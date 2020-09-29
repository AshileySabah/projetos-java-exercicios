package Exercicios13;
import java.util.Scanner;
public class Quadrado {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = input.nextDouble();
        
        double area = lado*lado;
        double dobroArea = area*2;
        
        System.out.println("Area: "+area+"\nArea dobrada: "+dobroArea);
    }
}
