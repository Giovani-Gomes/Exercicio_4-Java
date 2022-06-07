package Exercicios.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i=0; i<vetor.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetor[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i=0; i<vetor.length; i++){
            soma  = soma + vetor[i];
        }

        System.out.print("Vetor = ");
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nSoma é igual : " + soma);

    }
}


