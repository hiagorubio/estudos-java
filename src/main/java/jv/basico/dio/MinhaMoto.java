package jv.basico.dio;

public class MinhaMoto {
    public static void main(String[] args) {
        Moto moto = new Moto();

        System.out.println("Minha moto é uma " + moto.getModelo());
        System.out.println("Da " + moto.getMarca());
        System.out.println("Ano " + moto.getAno());
    }
}
