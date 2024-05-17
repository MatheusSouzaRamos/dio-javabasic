
import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> contatos;

    public AgendaContato(){
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!contatos.isEmpty())
            contatos.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public String toString(){
        return "" + contatos;
    }

    public int pesquisaPorNome(String nome){
        Integer pesquisado = null;
        if(!contatos.isEmpty())
            pesquisado = contatos.get(nome);
        return pesquisado;
    }
}
