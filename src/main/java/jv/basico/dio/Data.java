package jv.basico.dio;

import java.util.Date;

public class Data {
    public static void main(String[] args) {

        Date atual = new Date();
        System.out.println(atual);

        Long atualLongSystem = System.currentTimeMillis();
        System.out.println(atualLongSystem);
        Date atualLong = new Date(atualLongSystem);
        System.out.println(atual);

        Date meuNascimento = new Date(798111617000L);

        Date dataComp = new Date(1273960910000L);

        Date entregaAp = new Date(1670427000000L);

        int comparacao1 = dataComp.compareTo(meuNascimento);

        int comparacao2 = meuNascimento.compareTo(dataComp);

        System.out.println(comparacao1);
        System.out.println(comparacao2);

    }
}
