package exercicios.lista3;

import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        int la = 0;
        int lb = 0;
        int lc = 0;

        String texto = "Os valores não representam os lados de um triângulo";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira os valores a serem analisados como lados do triângulo.");
        System.out.println("Lado A: \n");
        la=Integer.parseInt(entrada.nextLine());

        System.out.println("Lado B: \n");
        lb=Integer.parseInt(entrada.nextLine());

        System.out.println("Lado C: \n");
        lc=Integer.parseInt(entrada.nextLine());

        if(la < lb+lc && lb < la+lc && lc < la+lb) {
            texto = "\nOs valores representam os lados de um triângulo";
        }
        System.out.println(texto);
    }
}
