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
}
