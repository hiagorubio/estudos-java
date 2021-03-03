package exercicios.lista3;

import java.util.Scanner;

public class MediaAlunoAprRep {
    public static void main(String[] args) {
        var aluno = " ";
        int primeiroBimestre = 0;
        int segundoBimestre = 0;
        int terceiroBimestre = 0;
        int quartoBimestre = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome:\n");
        aluno = leitor.nextLine();

        System.out.println("Qual a nota do primeiro bimestre?\n");
        primeiroBimestre = leitor.nextInt();
        System.out.println("Qual a nota do segundo bimestre?\n");
        segundoBimestre = leitor.nextInt();
        System.out.println("Qual a nota do terceiro bimestre?\n");
        terceiroBimestre = leitor.nextInt();
        System.out.println("Qual a nota do quarto bimestre?\n");
        quartoBimestre = leitor.nextInt();

        var media = (primeiroBimestre+segundoBimestre+terceiroBimestre+quartoBimestre)/4;

        System.out.println("\nSua média foi: " + media);

        if (media >= 17.5) {
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}
