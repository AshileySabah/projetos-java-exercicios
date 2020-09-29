package Exercicios19;
public class Questao22 {
    public static void main (String[]args){
        
        int[] vetorA = new int[20];
        int contadorZero = 0;
        int contadorUm = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 1); //Math.round gera valores de 0 a 1 (0.0, 0.1, 0.5, 1.0)
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == 0){
                contadorZero++;
                System.out.println("Valor: 0 Posição: "+i);
            }
            else if(vetorA[i] == 1){
                System.out.println("Valor: 1 Posição: "+i);
            }
        }
    }
}