package Exercicios14;
import java.util.Scanner;
public class Triangulo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo: ");
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();
        
        //condição triângulo
        boolean ladobc = (lado2 - lado3) < lado1 && lado1 < (lado2 + lado3);
        boolean ladoac = (lado1 - lado3) < lado2 && lado2 < (lado1 + lado3);
        boolean ladoab = (lado1 - lado2) < lado3 && lado3 < (lado1 + lado2);

        //isósceles
        boolean iso1 = lado1 == lado2 && lado1 != lado3;
        boolean iso2 = lado2 == lado3 && lado3 != lado1;
        boolean iso3 = lado3 == lado1 && lado3 != lado2;
        
        //escaleno
        boolean esc1 = lado1 != lado2;
        boolean esc2 = lado1 != lado3;
        boolean esc3 = lado3 != lado2;
        
        if(ladobc && ladoac && ladoab){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            }
            else if(iso1 || iso2 || iso3){
                System.out.println("Triângulo Isósceles");
            }
            else if(esc1 && esc2 && esc3){
                System.out.println("Triângulo Escaleno");
            }
        }
        else{
            System.out.println("Não é um triângulo");
        }
    } 
}