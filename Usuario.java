package Exercicios17;
import java.util.Scanner;
public class Usuario{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean cadastro;
        
        do{
            System.out.println("Digite seu nome de usuário: ");
            String nomeUsuario = input.nextLine();
            
            System.out.println("Digite sua senha de usuário: ");
            String senhaUsuario = input.nextLine();
            
            if(senhaUsuario.equalsIgnoreCase(nomeUsuario)){
                System.out.println("Senha e Usuário são iguais, mude isso.");
                cadastro = false;
            }
            else{
                System.out.println("Cadastro completo com êxito.");
                cadastro = true;
            }
        }while(cadastro == false);/*
        lembrar que as variaveis nomeUsuario e senhaUsuario só existem dentro do loop, então
        seria bom declará-las na parte de fora do loop:
            public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        String nomeUsuario;
        String senhaUsuario;
        
        boolean cadastro;
        
        do{
            System.out.println("Digite seu nome de usuário: ");
            nomeUsuario = input.nextLine();
            
            System.out.println("Digite sua senha de usuário: ");
            senhaUsuario = input.nextLine();
            
            if(senhaUsuario.equalsIgnoreCase(nomeUsuario)){
                System.out.println("Senha e Usuário são iguais, mude isso.");
                cadastro = false;
            }
            else{
                System.out.println("Cadastro completo com êxito.");
                cadastro = true;
            }
        }while(cadastro == false);
        */
    }
}