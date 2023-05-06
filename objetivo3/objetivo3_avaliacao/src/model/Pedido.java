package model;

import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private Double valor;

    // ligacao entre pedido x vendedor
    Vendedor vendedor;
}
