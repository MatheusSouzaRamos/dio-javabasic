public class Produto {
    private String nome;
    private double valor;
    private int qtd;

    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public int getQtd(){
        return qtd;
    }

    public String toString(){
        return "{" + nome + " " + valor + " " + qtd + "}";
    }
}
