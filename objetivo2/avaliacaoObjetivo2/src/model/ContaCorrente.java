package model;

public class ContaCorrente extends Conta implements Associado {
    public ContaCorrente() {
    }

    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public Double lucros(Integer qdeContas, Double valorCota) {
        return this.saldo = qdeContas * valorCota;
    }
}
