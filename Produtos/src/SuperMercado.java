

public class SuperMercado {
    public static void main(String[] args) {
        CadastroProdutos carrinho = new CadastroProdutos();
        carrinho.adicionarProduto("Pao", 1, 2.5, 5);
        carrinho.adicionarProduto("Salsicha", 2, 13.8, 9);
        carrinho.adicionarProduto("Queijo", 3, 22.6, 1);
        carrinho.adicionarProduto("Nescau", 4, 13.4, 1);
        carrinho.adicionarProduto("Amora", 5, 7.8, 2);
        carrinho.adicionarProduto("Castanha", 6, 10.34, 18);
        // carrinho.adicionarProduto("Teste", 123, 1000, 1000);

        System.out.println(carrinho.exibirProdutosPorNome());
        System.out.println(carrinho.exibiProdutosPorCodigo());
        System.out.println(carrinho.exibirProdutosPorPreco());
        System.out.println(carrinho.exibirProdutoPorQuantidade());
    }
}
