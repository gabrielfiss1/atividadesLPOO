package model;

public class Cliente implements Associado {
    private String nome;
    public Cliente() {
    }

    public Cliente(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public Double lucros(Integer qdeContas, Double valorCota) {
        return  qdeContas * valorCota;
    }
}
