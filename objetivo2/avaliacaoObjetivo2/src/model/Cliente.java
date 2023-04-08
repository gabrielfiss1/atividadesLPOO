package model;

public class Cliente implements Associado {
    private String nome;

    private Double lucros;

    private Integer numeroCotas;

    public Cliente() {
    }


    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", lucros=" + lucros +
                ", numeroCotas=" + numeroCotas +
                '}';
    }

    @Override
    public Double lucros(Integer qdeContas, Double valorCota) {
        return this.lucros = qdeContas * valorCota;
    }

    @Override
    public Double getLucros() {
        return this.lucros;
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
