package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int quantidade = 0;

        for (int i=0; i<idades.length; i++){
            System.out.print("Entre com a idade. Pessoa " + (i+1) + " : ");
            idades[i] = scan.nextInt();
        }


        for (int i=0; i<idades.length; i++){
            if (idades[i] > 35){
                quantidade++;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }

        System.out.println("\nQuantidade de pessoas com idade maiores que 35 anos: " + quantidade);

    }
}


