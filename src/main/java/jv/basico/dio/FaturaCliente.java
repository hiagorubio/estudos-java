package jv.basico.dio;

import java.util.Calendar;

public class FaturaCliente {
    public static void main(String[] args) {

        Calendar vencimento = Calendar.getInstance();

        vencimento.add(Calendar.DATE, 9);
        System.out.println("A data de vencimento é " + vencimento.getTime());

        vencimento.add(Calendar.DATE, 10);
        System.out.println("O limite para pagamento é " + vencimento.getTime());

        vencimento.add(Calendar.DATE, 2);
        System.out.println("Como a data limite caiu em um sábado, a nova data limite para pagamento é " + vencimento.getTime());
    }
}
