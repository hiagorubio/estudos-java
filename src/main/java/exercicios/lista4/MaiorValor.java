package exercicios.lista4;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        var maiorValor = 0;
        var numero = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Infome um número inteiro:\n");
        numero = Integer.parseInt(leitor.nextLine());
        if (numero > maiorValor) {
            maiorValor = numero;
        }
        System.out.println("Infome outro número inteiro:\n");
        numero = Integer.parseInt(leitor.nextLine());
        if (numero > maiorValor) {
            maiorValor = numero;
        }
        System.out.println("Infome mais um número inteiro:\n");
        numero = Integer.parseInt(leitor.nextLine());
        if (numero > maiorValor) {
            maiorValor = numero;
        }
        System.out.println("Infome outro número inteiro:\n");
        numero = Integer.parseInt(leitor.nextLine());
        if (numero > maiorValor) {
            maiorValor = numero;
        }
        System.out.println("\nO maior valor digitado foi: " + maiorValor);
    }
}
