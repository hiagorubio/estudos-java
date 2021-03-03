package exercicios.lista2;

import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        String nome = " ";
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá! Qual é o seu nome?\n");
        nome = leitor.nextLine();
        System.out.println("\nBem vindo(a), " + nome + ".");
    }
}
