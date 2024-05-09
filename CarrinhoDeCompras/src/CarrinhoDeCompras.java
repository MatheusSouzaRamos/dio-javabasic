import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Compra> compras = new ArrayList();

    public void adicionarCompra(String descricao){
        compras.add(new Compra(descricao));
    }

    public void removerCompra(String descricao){
        List<Compra> removerCompras = new ArrayList();
        for(Compra c : compras){
            if(c.getDescricao().equalsIgnoreCase(descricao)){
                removerCompras.add(c);
            }
        }

        if(removerCompras.size() != 0){
            compras.removeAll(removerCompras);
        }

    }

    public int obterTotalDeCompras(){
        return compras.size();
    }

    public void obterListaDeCompras(){
        System.out.println(compras);
    }


    public static void main(String [] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarCompra("Arroz");
        carrinho.adicionarCompra("Feijao");
        carrinho.adicionarCompra("Nescau");
        carrinho.adicionarCompra("Farinha");

        System.out.println("Numero total de compras: " + carrinho.obterTotalDeCompras());

        carrinho.removerCompra("arroz");
        System.out.println("Numero total de compras: " + carrinho.obterTotalDeCompras());

        carrinho.obterListaDeCompras();
    }
}
