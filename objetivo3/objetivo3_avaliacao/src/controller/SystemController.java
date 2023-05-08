package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Item;
import model.Pedido;
import model.Produto;
import model.Vendedor;

import java.util.Date;
import java.util.GregorianCalendar;


public class SystemController {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("xxxxxxx", "5399999", "VaiMarte");
        Fornecedor fornecedor2 = new Fornecedor("xxxxxxx", "5399994", "Rodrigo Eletro");
        Vendedor vendedor1 = new Vendedor(1, "José", "Avenida Logo Ali", "Santa", "96323333", "Gado Grande", "RS", "011");
        Vendedor vendedor2 = new Vendedor(2, "Hugo", "Rua das Laranjas", "Cidade Baixa", "96321111", "Taboao dos Tapes", "RS", "111");
        Pedido pedido1 = new Pedido(1, new GregorianCalendar(2022, 6, 20, 22, 30), 100.0,vendedor1);
        Pedido pedido2 = new Pedido(2, new GregorianCalendar(2022, 4, 9, 7, 30), 70.0, vendedor2);

    }
}
