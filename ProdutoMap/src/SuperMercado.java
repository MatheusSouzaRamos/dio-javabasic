public class SuperMercado {
    public static void main (String [] args){
        EstoqueProduto carrinho = new EstoqueProduto();
        carrinho.exibirProdutos();

        carrinho.adicionarProduto(1, "Chocolate", 7.99, 3);
        carrinho.adicionarProduto(1, "Chocolate", 7.99, 3);

        carrinho.adicionarProduto(2, "Barbeador", 9.25, 2);
        carrinho.adicionarProduto(3, "Garrafa", 15, 1);
        carrinho.adicionarProduto(4, "Caneta", 2.00, 5);
        carrinho.adicionarProduto(5, "Lapiseira", 10.50, 1);
        carrinho.adicionarProduto(6, "Balas", 0.25, 8);
        //carrinho.adicionarProduto(7, "Teste", 0.1, 100);

        carrinho.exibirProdutos();
        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotalEstoque());
        
        carrinho.removerProduto(5);
        carrinho.exibirProdutos();
        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotalEstoque());

        System.out.println("Produto com maior valor agregado: " + carrinho.obterProdutoComMaiorValorAgregado());
        System.out.println("Produto mais barato: " + carrinho.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + carrinho.ObterProdutoMaisCaro());


    }
}
