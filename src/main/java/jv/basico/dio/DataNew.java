package jv.basico.dio;

import java.time.LocalDateTime;

public class DataNew {
    public static void main(String[] args){

        LocalDateTime momento = LocalDateTime.of(2010, 05, 15, 10, 00,00);
        System.out.println(momento);

        LocalDateTime futuro = momento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
