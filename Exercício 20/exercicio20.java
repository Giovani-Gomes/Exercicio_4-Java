package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacaoDolar;

        System.out.print("Adiocione a cotação do dólar: ");
        cotacaoDolar = scan.nextDouble();

        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = cotacaoDolar * (i+1);
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " | ");
        }
    }
}


