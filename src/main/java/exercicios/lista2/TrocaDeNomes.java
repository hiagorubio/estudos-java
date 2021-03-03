package exercicios.lista2;

import java.util.Scanner;

public class TrocaDeNomes {
    public static void main(String[] args) {
        var nome = "H.";
        var sobreNome = "Arantes";

        Scanner leitor = new Scanner(System.in);

        System.out.println("O nome salvo atualmente é: " + nome + " " + sobreNome);
        System.out.println("Informe o novo nome:\n");
        nome = leitor.nextLine();
        System.out.println("Informe o novo sobrenome:\n");
        sobreNome = leitor.nextLine();

        System.out.println("O nome agora é: " + nome + " " + sobreNome);
    }
}
