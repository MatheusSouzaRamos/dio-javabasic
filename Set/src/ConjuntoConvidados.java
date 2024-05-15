
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;
    
    public ConjuntoConvidados(){
        listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        listaConvidados.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidado removerConvidado = null;
        for(Convidado c : listaConvidados)
            if(c.getCodigo() == codigo){
                removerConvidado = c;
                break;
            }

        if(removerConvidado != null)
            listaConvidados.remove(removerConvidado);
    }

    public int contarConvidados(){
        return  listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }

    public String toString(){
        return "" + listaConvidados;
    }
}
