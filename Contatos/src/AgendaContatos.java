
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda; 

    public AgendaContatos(){
        agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        agenda.add(new  Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    @Override
    public String toString(){
        return "" + agenda;
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> pesquisados = new HashSet<>();
        for(Contato c : agenda){
            if(c.getNome().startsWith(nome)){
                pesquisados.add(c);
            }    
        }
        return pesquisados;
    }

    public void atualizarNumero(String nome, int numeroAntigo, int numeroNovo){
        for(Contato c : agenda){
            if(c.getNome().equals(nome) && c.getNumeroTelefone() == numeroAntigo){
                agenda.add(new Contato(c.getNome(), numeroNovo));
                agenda.remove(c);
                break;
            }
        }
    }
}
