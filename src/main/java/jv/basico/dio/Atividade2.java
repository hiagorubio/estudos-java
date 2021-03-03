package jv.basico.dio;

import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Atividade2 {

    public static void main(String[] args) throws IOException {
        int E = 0;
        boolean checkEInput = true;
        while (checkEInput) {
            System.out.println("Digite um número inteiro entre 1 e 1000: \n");
            try {
                Scanner leitor = new Scanner(System.in);
                E = leitor.nextInt();
                if (E > 1 && E < 1000) {
                    checkEInput = false;
                } else {
                    System.out.println("\nO número inteiro precisa estar entre 1 e 1000");
                 }
            } catch (InputMismatchException ex) {
                System.out.println("\nNão é um número inteiro");
            }
        }

        int menor = 0, posMenor = 0;
        boolean checkMenorPosMenorInput = true;
        while (checkMenorPosMenorInput) {
            System.out.println("Digite a quantidade informada anteriormente em números inteiros separados por um espaço:\n");

            Scanner leitorArray = new Scanner(System.in);

            String line = leitorArray.nextLine();

            List<String> inputArray = new ArrayList<>(Arrays.asList(line.split(" ")));

            if(inputArray.size() == E) {
                for(int i = 0; i < inputArray.size(); i++) {
                    int value = 0;
                    try {
                        value = Integer.parseInt(inputArray.get(i));
                        if (i == 0) {
                            menor = value;
                            posMenor = i;
                        } else if (value < menor) {
                            menor = value;
                            posMenor = i;
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Em algum campo não foi digitado um número inteiro");
                        break;
                    }
                }
                checkMenorPosMenorInput = false;
                System.out.println("\nMenor valor: " + menor);
                System.out.println("Posição: " + posMenor);
            }
        }
    }
}
