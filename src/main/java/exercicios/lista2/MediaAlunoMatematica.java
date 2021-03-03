package exercicios.lista2;

import java.util.Scanner;

public class MediaAlunoMatematica {
    public static void main(String[] args){
        var nome = " ";
        int primeiroBimestre = 0;
        int segundoBimestre = 0;
        int terceiroBimestre = 0;
        int quartoBimestre = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome:\n");
        nome = leitor.nextLine();

        System.out.println("Qual a nota do primeiro bimestre?\n");
        primeiroBimestre = leitor.nextInt();
        System.out.println("Qual a nota do segundo bimestre?\n");
        segundoBimestre = leitor.nextInt();
        System.out.println("Qual a nota do terceiro bimestre?\n");
        terceiroBimestre = leitor.nextInt();
        System.out.println("Qual a nota do quarto bimestre?\n");
        quartoBimestre = leitor.nextInt();

        System.out.println("\nSua média atual é de: " + (primeiroBimestre+segundoBimestre+terceiroBimestre+quartoBimestre)/4);
    }
}
