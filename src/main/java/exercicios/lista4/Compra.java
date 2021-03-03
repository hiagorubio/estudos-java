package exercicios.lista4;

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        var nome = " ";
        int quantidadeDeDinheiro = 0;
        var nomeDoProduto = " ";
        int valorDoProduto = 0;
        int quantidadeDeProdutos = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome?\n");
        nome = leitor.nextLine();
        System.out.println("Quanto você possui de dinheiro?\n");
        quantidadeDeDinheiro = Integer.parseInt(leitor.nextLine());
        System.out.println("Qual é o produto desejado?\n");
        nomeDoProduto = leitor.nextLine();
        System.out.println("Qual é o valor do produto?\n");
        valorDoProduto = Integer.parseInt(leitor.nextLine());
        System.out.println("Quantas unidades você vai querer?\n");
        quantidadeDeProdutos = Integer.parseInt(leitor.nextLine());

        int valorTotal = valorDoProduto * quantidadeDeProdutos;

        if (quantidadeDeDinheiro >= quantidadeDeProdutos) {
            System.out.println("\nVocê possui dinheiro suficiente.");
        } else {
            System.out.println("\nVocê não possui dinheiro suficiente.");
        }
    }
}
