package exercicios.lista2;

import java.util.Scanner;

public class TabuadaUsuario {
    public static void main(String[] args) {
        int input = 0;
        String valorLido = " ";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número: \n");
        valorLido = leitor.nextLine();
        input = Integer.parseInt(valorLido);

        System.out.println("\n" + input + " x 1 = " + (input*1));
        System.out.println(input + " x 1 = " + (input*2));
        System.out.println(input + " x 1 = " + (input*3));
        System.out.println(input + " x 1 = " + (input*4));
        System.out.println(input + " x 1 = " + (input*5));
        System.out.println(input + " x 1 = " + (input*6));
        System.out.println(input + " x 1 = " + (input*7));
        System.out.println(input + " x 1 = " + (input*8));
        System.out.println(input + " x 1 = " + (input*9));
        System.out.println(input + " x 1 = " + (input*10));
    }
}
