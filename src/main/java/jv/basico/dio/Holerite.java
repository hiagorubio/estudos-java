package jv.basico.dio;

public class Holerite {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(2800);
        System.out.println(supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(1300);
        System.out.println(atendente.calculaImposto());
    }
}
