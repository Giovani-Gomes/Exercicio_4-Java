package Exercicios.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;
        
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nQuatidade de números pares: " + qtdPares);
    }
}


