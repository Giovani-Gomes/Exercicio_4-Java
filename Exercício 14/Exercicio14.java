package Exercicios.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int Numimpar = 0;

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }


        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                Numimpar++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("\nMédia: " + (soma/Numimpar));
    }
}


