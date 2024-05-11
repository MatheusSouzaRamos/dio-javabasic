import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    //constructor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public String toString(){
        return nome;
    }

    //comparable
    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }


}

class CompararAltura implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}