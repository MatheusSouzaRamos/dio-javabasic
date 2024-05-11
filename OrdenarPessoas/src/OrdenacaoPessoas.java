import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void adcionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenada = new ArrayList<>();
        ordenada = pessoas;
        //List<Pessoa> ordenada = new ArrayList<>(pessoas);
        Collections.sort(ordenada);
        return ordenada;
    }

    public List<Pessoa>ordenarPorAltura(){
        List<Pessoa> ordenada = new ArrayList<>(pessoas);
        Collections.sort(ordenada, new CompararAltura());
        return ordenada;
    }
}
