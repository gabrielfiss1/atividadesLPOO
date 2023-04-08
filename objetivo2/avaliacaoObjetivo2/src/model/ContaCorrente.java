package model;

public class ContaCorrente extends Conta implements Associado {
    private Integer numeroCotas;

    public ContaCorrente() {
    }

    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "numeroCotas=" + numeroCotas +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public Double lucros(Integer qdeContas, Double valorCota) {
        return this.saldo += qdeContas * valorCota;
    }

    @Override
    public Double getLucros() {
        return this.saldo;
    }

    @Override
    public Integer qntCotas(Integer qdeContas) {
        return this.numeroCotas = qdeContas ;
    }

    @Override
    public Integer getCotas() {
        return this.numeroCotas;
    }


}
