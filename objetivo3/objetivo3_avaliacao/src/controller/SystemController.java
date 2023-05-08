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

            if (produto1.getQuantidade() > 0 && produto2.getQuantidade() > 0) {
                System.out.println("\nRegistro das vendas:");
                List<Pedido> pedidos = new ArrayList();
                pedidos.add(pedido1);
                pedidos.add(pedido2);
                System.out.println(pedidos);
                pedido1.getItems().add(item1);
                pedido2.getItems().add(item2);
                vendedor1.getPedidos().add(pedido1);
                vendedor2.getPedidos().add(pedido2);
                System.out.println("\nEstoque das vendas:");
                produto1.setQuantidade(produto1.getQuantidade() - item1.getQuantidade());
                produto2.setQuantidade(produto2.getQuantidade() - item2.getQuantidade());
                System.out.println("\nVenda 1: ");
                System.out.println(vendedor1.getPedidos());
                System.out.println("\nVenda 2: ");
                System.out.println(vendedor2.getPedidos());
                //
                Produto produto3 = new Produto(3, "PS5", 1, 5000.0, fornecedor1);
                Produto produto4 = new Produto(4, "Lava-roupa", 1, 2000.0, fornecedor1);
                int qtdfornecimento1 = 45;
                double total1 = (double)qtdfornecimento1 * produto3.getPreco();
                produto3.setQuantidade(produto3.getQuantidade() + qtdfornecimento1);
                Fornecimento fornecimento1 = new Fornecimento(new GregorianCalendar(2023, 5, 19, 5, 0), total1, fornecedor1, produto3);
                int qtdfornecimento2 = 5;
                double total2 = (double)qtdfornecimento2 * produto4.getPreco();
                produto4.setQuantidade(produto4.getQuantidade() + qtdfornecimento2);
                Fornecimento fornecimento2 = new Fornecimento(new GregorianCalendar(2023, 6, 11, 1, 10), total2, fornecedor1, produto4);
                List<Fornecimento> fornecimentos = new ArrayList();
                fornecimentos.add(fornecimento1);
                fornecimentos.add(fornecimento2);
                System.out.print("\n Lista de fornecimentos: \n");
                System.out.println(fornecimentos);
                double totalFornecido = 0.0;

                Fornecimento fornecimento;
                for(Iterator var1 = fornecimentos.iterator(); var1.hasNext(); totalFornecido += fornecimento.getValorTotal()) {
                    fornecimento = (Fornecimento)var1.next();
                }

                System.out.print("\nTotal fornecido:" + NumberFormat.getCurrencyInstance().format(totalFornecido) + "\n");
            }    comportamento1();
    }


    private static void comportamento1() {
        mythrowException();
    }

    private static void mythrowException() {
        try {
            System.out.println("\nErro, estoque insuficiente.\n");
            throw new SystemControllerEstoqueInsuficienteExcecao();

        } catch (SystemControllerEstoqueInsuficienteExcecao var2) {
            var2.printStackTrace();

        } finally {
            System.err.println("Finalmente executado.");
        }

    }
}



