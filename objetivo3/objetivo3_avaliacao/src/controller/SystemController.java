package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Item;
import model.Pedido;
import model.Produto;
import model.Vendedor;

import java.text.NumberFormat;
import java.util.*;


public class SystemController {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("xxxxxxx", "5399999", "VaiMarte");
        Fornecedor fornecedor2 = new Fornecedor("xxxxxxx", "5399994", "Rodrigo Eletro");
        Vendedor vendedor1 = new Vendedor(1, "José", "Avenida Logo Ali", "Santa", "96323333", "Gado Grande", "RS", "011");
        Vendedor vendedor2 = new Vendedor(2, "Hugo", "Rua das Laranjas", "Cidade Baixa", "96321111", "Taboao dos Tapes", "RS", "111");
        Pedido pedido1 = new Pedido(1, new GregorianCalendar(2023, 5, 21, 22, 30), 1000.0, vendedor1);
        Pedido pedido2 = new Pedido(2, new GregorianCalendar(2023, 4, 9, 7, 30), 700.0, vendedor2);
        Produto produto1 = new Produto(1, "Xbox One", 1, 1500.0, fornecedor1);
        Produto produto2 = new Produto(2, "Mesa digital", 1, 500.0, fornecedor2);
        Item item1 = new Item(1, 3.0, 1);
        Item item2 = new Item(2, 2.0, 1);

    }
}


