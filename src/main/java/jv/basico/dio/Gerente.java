package jv.basico.dio;

public class Gerente extends Funcionarios {

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public double calculaImposto() {
        return this.salario * 0.1;
    }
}
