
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double valor;
    private int qntd;

    public Produto(String nome, int codigo, double valor, int qntd){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.qntd = qntd;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public int getQntd() {
        return qntd;
    }

    @Override
    public String toString(){
        return "{" + nome + " " + codigo + " " + valor + " " + qntd + "}";
    }

    // hash euqals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}

class ComparatorValor implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        
        if(p1.getValor() > p2.getValor())
            return -1;
        if(p1.getValor() < p2.getValor())
            return 1;
        return 0;
    }

}

class ComparatorNome implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return p1.getNome().compareTo(p2.getNome());
    }
}
// nome codigo valor qunatidade
class ComparatorCodigo implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2){
        if(p1.getCodigo() > p2.getCodigo())
            return -1;
        if(p1.getCodigo() < p2.getCodigo())
            return 1;
        return 0;
    }
}

class ComparatorQuantidade implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        // if(p1.getQntd() > p2.getQntd())
        //     return -1;
        // if(p2.getQntd() < p2.getQntd())
        //     return 1;
        // return 0;

        return Integer.compare(p1.getQntd(), p2.getQntd());
    }
}