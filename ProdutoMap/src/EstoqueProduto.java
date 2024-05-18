
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Integer, Produto> produtos;

    public EstoqueProduto(){
        produtos = new HashMap<>();
    }

    public void adicionarProduto(int codigo, String nome, double valor, int qtd){
        produtos.put(codigo, new Produto(nome, valor, qtd));
    }

    public void removerProduto(int codigo){
        produtos.remove(codigo);
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque(){
        double total = 0d;
        for(Produto p : produtos.values()){
            total += p.getValor() * p.getQtd();
        }
        return total;
    }

    public Produto ObterProdutoMaisCaro(){
        Produto pesquisado = null;
        double maior = 0;
        boolean primeiro = true;

        for(Produto p : produtos.values()){
            if(primeiro){
                maior = p.getValor();
                pesquisado = p;
                primeiro = false;
            }else if(p.getValor() > maior){
                maior = p.getValor();
                pesquisado = p;
            }
        }
        return pesquisado;
    }

    public Produto obterProdutoMaisBarato(){
        Produto pesquisado = null;
        double menor = 0;
        boolean primeiro = true;

        for(Produto p : produtos.values()){
            if(primeiro){
                menor = p.getValor();
                pesquisado = p;
                primeiro = false;
            }else if (p.getValor() < menor){
                menor = p.getValor();
                pesquisado = p;
            }

        }
        return pesquisado;
    }

    public Produto obterProdutoComMaiorValorAgregado(){
        Produto pesquisado = null;
        double maiorValorAgregado = 0d;
        double totalProduto = 0d;

        for(Produto p : produtos.values()){
            totalProduto = p.getQtd() * p.getValor();
            if(totalProduto > maiorValorAgregado){
                maiorValorAgregado = totalProduto;
                pesquisado = p;
            }
        }
        return pesquisado;
    }

}
