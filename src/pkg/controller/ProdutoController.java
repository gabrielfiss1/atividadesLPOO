package pkg.controller;
import pkg.model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", "RGB", 320.4, 10 );
        Produto produto2 = new Produto("Mouse", "Wireless", 128.4, 3 );
        Produto produto3 = new Produto("Notebook", "Acer Nitro", 4000.41, 5 );
        Produto produto4 = new Produto("Carregador", "Fast", 36.4, 8 );
        Produto produto5 = new Produto("Celular", "Samsung S20", 2008.4, 2 );
        System.out.println(produto1.getDescricao());
        System.out.println(produto1);
        System.out.println();
        System.out.println(produto1.setEstoque(30));
        System.out.println(produto1);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos);

        //ordenar a colecao
        produtos.sort(Comparator.comparing(Produto::getValor).reversed());
        System.out.println("--------LISTA ORDENADA--------");
        System.out.println(produtos);

        System.out.println("\n\n MAP");

        Map<Produto, Integer> produtosMap = new HashMap<>();
        produtosMap.put(produto1, produto1.getEstoque());
        produtosMap.put(produto2, produto2.getEstoque());
        produtosMap.put(produto3, produto3.getEstoque());
        System.out.println(produtosMap);
    }
}
