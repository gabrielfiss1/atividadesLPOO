package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {
    private String local;

    //ligacao CLiente x Pedido
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor(String local, List<Pedido> pedidos) {
        this.local = local;
        this.pedidos = pedidos;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        int varMat = this.getMatricula();
        return "Vendedor{matricula=" + varMat + "," +
                " nome='" + this.getNome() +
                "', endereco='" + this.getEndereco() +
                "', bairro='" + this.getBairro() +
                "', cep='" + this.getCep() +
                "', cidade='" + this.getCidade() +
                "', estado='" + this.getEstado() +
                "'local='" + this.local +
                '}';
    }
}


