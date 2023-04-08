package model;

public class ContaCorrente extends Conta {
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
}
