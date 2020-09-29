package Exercicios17;
import java.text.DecimalFormat;
public class SalarioAumentoInterpretado {
    public static void main(String[]args){
        DecimalFormat formatarNumero = new DecimalFormat("###,###.##");
        double salario = 1000;
        int anoInicial = 1996;
        int anoAtual = 2020;
        int i;
        double aumento = 15;
        
        for(i = 0; i <= (anoAtual-anoInicial); i++){
            salario = salario+aumento;
            //System.out.println(salario);
            System.out.println("Ano = "+(anoInicial+i));
            System.out.println("Aumento = "+formatarNumero.format(aumento));
            System.out.println("Salario = "+formatarNumero.format(salario));
            System.out.println("");
            aumento = aumento*2;
        }
    }
}
