package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];
        int impar = 0;
        int par = vetor.length - impar;
        double porcentagemPar = (par * 100)/ vetor.length;
        double porcentagemImpar = 100 - porcentagemPar;

        for (int i = 0; i< vetor.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetor[i] = scan.nextInt();
        }
        
        for (int i = 0; i< vetor.length; i++){
            if (vetor[i] % 2 != 0){
                impar++;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i< vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem Pares: " + porcentagemPar);
        System.out.println("Porcentagem Ímpares: " + porcentagemImpar);
    }
}


