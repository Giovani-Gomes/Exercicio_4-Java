package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i=0; i<idades.length; i++){
            System.out.print("Entre com a idade da pessoa " + (i+1) + " :");
            idades[i] = scan.nextInt();
        }

        for (int i=1; i<idades.length; i++){
            if (idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }

        System.out.println("\nMenor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice Maior idade: " + indexMaior);
    }
}


