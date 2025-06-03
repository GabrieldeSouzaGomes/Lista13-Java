package lista13vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        // Entrada dos elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Entrada do elemento a ser removido
        System.out.print("Digite o elemento a ser removido: ");
        int elementoRemover = sc.nextInt();

        // Contar quantas vezes o elemento aparece
        int contador = 0;
        for (int valor : vetor) {
            if (valor == elementoRemover) {
                contador++;
            }
        }

        // Criar novo vetor sem os elementos a remover
        int[] novoVetor = new int[tamanho - contador];
        int j = 0;
        for (int valor : vetor) {
            if (valor != elementoRemover) {
                novoVetor[j++] = valor;
            }
        }

        // Exibir resultado
        System.out.println("Vetor após a remoção: " + Arrays.toString(novoVetor));
        
        sc.close();
    }
}
