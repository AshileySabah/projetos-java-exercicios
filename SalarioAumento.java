package Exercicios17;
public class SalarioAumento {
    public static void main(String[]args){
        double salario = 1000;
        int anoInicial = 1996;
        int anoAtual = 2020;
        double percentagemInicial = 1.5;
        int i;
        int auxiliar = 1;
        double novoSalario = 0;
        
        //salario = salario + (salario*percentagemInicial)/100;
        System.out.println(salario);
        
        for(i = 0; i <= (anoAtual-anoInicial); i++){
            salario = salario + (salario*percentagemInicial*auxiliar)/100;
            //System.out.println(salario);
            System.out.println("Ano = "+(anoInicial+i)+" Porcentagem = "+(percentagemInicial*auxiliar)+" Salario = "+salario);
            auxiliar = auxiliar*2;
            
        }
    }
}
/*
            for(j = 1; j <= (anoAtual-anoInicial); j++){
                
            }
*/