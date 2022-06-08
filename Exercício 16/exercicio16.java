package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor = 0;
        int somaMaior = 0;
        int quantidadeMaior = 0;
        int igual = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor da posição " + i + " : ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual++;
            } else if (vetorA[i] < 15) {
                somaMenor += vetorA[i];
            } else {
                quantidadeMaior++;
                somaMaior = somaMaior + vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nQtd números Iguais que 15: " + igual);
        System.out.println("Soma números Menores que 15: " + somaMenor);
        System.out.println("Média números Maiores que15: " + (somaMaior / quantidadeMaior));

    }
}


