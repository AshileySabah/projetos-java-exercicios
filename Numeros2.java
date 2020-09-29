package Exercicios14;
import java.util.Scanner;
public class Numeros2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 != num2 && num2 != num3 && num1 != num3){
            if(num1 > num2 && num1 > num3){
                System.out.println(num1+" é o maior");
            }
            else if(num2 > num3 && num2 > num3){
                System.out.println(num2+" é o maior");
            }
            else{
                System.out.println(num3+" é o maior");
            }
        }
        
        else if(num1 == num2 && num1 != num3){
            if(num1 > num3){
                System.out.println(num1+" é o maior");
            }
            else{
                System.out.println(num3+" é o maior");
            }
        }
        
        else if(num1 == num3 && num1 != num2){
            if(num1 > num2){
                System.out.println(num1+" é o maior");
            }
            else{
                System.out.println(num2+" é o maior");
            }
        }
        
        else if(num2 == num3 && num2 != num1){
            if(num2 > num1){
                System.out.println(num2+" é o maior");
            }
            else{
                System.out.println(num1+" é o maior");
            }
        }
        
        else{
            System.out.println("Todos têm o mesmo valor");
        }
    }     
} 