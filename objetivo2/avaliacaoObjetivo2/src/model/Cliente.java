package model;

public class Cliente implements Associado {
    private String nome;
    public Cliente() {
    }



    @Override
    public String toString() {
        return "\nCliente{" +
                "saldo=" +
                '}';
    }

    @Override
    public Double lucros(Integer qdeContas, Double valorCota) {
        return  qdeContas * valorCota;
    }
}
