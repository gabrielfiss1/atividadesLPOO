package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private Double valor;

    // ligacao entre pedido x vendedor
    Vendedor vendedor;

    //ligacao pedido x item
    private List<Item> items = new ArrayList();
}
