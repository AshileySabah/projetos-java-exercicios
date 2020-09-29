package Exercicios14;
import java.util.Scanner;
public class VogalConsoante {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = input.next();
        boolean a = letra.equals("a")||letra.equals("A");
        boolean e = letra.equals("e")||letra.equals("E");
        boolean i = letra.equals("i")||letra.equals("I");
        boolean o = letra.equals("o")||letra.equals("O");
        boolean u = letra.equals("u")||letra.equals("U");
        boolean comparar = a||e||i||o||u;
        if(comparar == true){
            System.out.println(letra+" é vogal");
        }
        else{
            System.out.println(letra+" não é vogal");
        }
    }
}