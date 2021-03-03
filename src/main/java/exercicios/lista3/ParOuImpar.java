package exercicios.lista3;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int n = 0;
        int resto = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número:\n");

        n = Integer.parseInt(leitor.nextLine());
        resto = n % 2;

        if (resto == 0) {
            System.out.println("\nO número é par.");
        } else {
            System.out.println("\nO número é ímpar.");
        }
    }
}
