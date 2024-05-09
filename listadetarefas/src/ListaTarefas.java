import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> removerTarefas = new ArrayList<>();

        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefas.add(t);
            }
        }

        if(removerTarefas.size() != 0){
            listaTarefas.removeAll(removerTarefas);
        }

    }

    public int obterTotaldeTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }



    public static void main(String [] args){
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());

        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());

        listaTarefas.adicionarTarefa("Teste");
        listaTarefas.adicionarTarefa("Teste");
        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());
        listaTarefas.removerTarefa("Teste");
        System.out.println("Numero total de elementos na lista = " + listaTarefas.obterTotaldeTarefas());

        listaTarefas.obterDescricoesTarefas();
    }

}
