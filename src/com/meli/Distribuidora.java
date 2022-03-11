package com.meli;

import com.meli.produto.NaoPereciveis;
import com.meli.produto.Pereciveis;
import com.meli.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static double calculaTotalProdutos(List<Produto> produtos, int quantidadeDeItems) {
        double valorTotal = 0;
        for (Produto prod: produtos) {
            valorTotal += prod.calcular(quantidadeDeItems);
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Pereciveis("queijo", 30.00, 10));
        produtos.add(new NaoPereciveis("feijão", 10.00, "alimento"));
        produtos.add(new Pereciveis("presunto", 5.0, 1));
        produtos.add(new Pereciveis("frango", 18.00, 3));
        produtos.add(new NaoPereciveis("boné", 60.00, "vestuário"));

        System.out.println(calculaTotalProdutos(produtos, 5));
    }
}
