package exercicios.lista4;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        var produto = " ";
        var precoDoProduto = 0;
        var desconto10 = 0;
        var desconto20 = 0;
        var desconto30 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o produto desejado?\n");
        produto = leitor.nextLine();
        System.out.println("Qual o valor do produto desejado?\n");
        precoDoProduto = Integer.parseInt(leitor.nextLine());

        desconto10 = (precoDoProduto * 10)/100;
        desconto20 = (precoDoProduto * 20)/100;
        desconto30 = (precoDoProduto * 30)/100;

        if (precoDoProduto <= 100) {
            System.out.println("\nDescontos somente em produtos acima de R$100.");
        } else if (precoDoProduto > 100 && precoDoProduto <=200) {
            System.out.println("\nValor final do produto = R$" + (precoDoProduto - desconto10) + " e o desconto total foi de R$" + desconto10 + ".");
        } else if (precoDoProduto > 200 && precoDoProduto <=300) {
            System.out.println("\nValor final do produto = R$" + (precoDoProduto - desconto20) + " e o desconto total foi de R$" + desconto20 + ".");
        } else if (precoDoProduto > 300) {
            System.out.println("\nValor final do produto = R$" + (precoDoProduto - desconto30) + " e o desconto total foi de R$" + desconto30 + ".");
        }
    }
}
