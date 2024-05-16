
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> carrinho;

    public CadastroProdutos(){
        carrinho = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double valor, int qntd){
        carrinho.add(new Produto(nome, codigo, valor, qntd));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> organizado = new TreeSet<>(carrinho);
        return organizado;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> organizado = new TreeSet<>(new ComparatorValor());
        organizado.addAll(carrinho);
        return organizado;
    }

    // public Set<Produto> exibirProdutosPorNome2(){
    //     Set<Produto> organizado = new TreeSet<>(new ComparatorNome());
    //     organizado.addAll(carrinho);
    //     return organizado;
    // }

    public Set<Produto> exibiProdutosPorCodigo(){
        Set<Produto> organizado = new TreeSet<>(new ComparatorCodigo());
        organizado.addAll(carrinho);
        return organizado;
    }

    public Set<Produto> exibirProdutoPorQuantidade(){
        Set<Produto> organizado = new TreeSet<>(new ComparatorQuantidade());
        organizado.addAll(carrinho);
        return organizado;
    }
}
