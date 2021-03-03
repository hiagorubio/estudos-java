package jv.basico.dio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Atividade1 {

    public static boolean isInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("\nNão é um número inteiro");
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputOne = 0;

        boolean checkOneInput = true;
        while (checkOneInput) {
            System.out.println("Digite um número inteiro: \n");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(isInt(input)) {
                inputOne = Integer.parseInt(input);
                checkOneInput = false;
            }

        }

        int inputTwo = 0;

        boolean checkTwoBInput = true;
        while (checkTwoBInput){
            System.out.println("Digite outro número inteiro \n");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(isInt(input)) {
                inputTwo = Integer.parseInt(input);
                checkTwoBInput = false;
            }

        }

        int PROD = inputOne * inputTwo;
        System.out.println("\nProduto = " + PROD);

    }
}
