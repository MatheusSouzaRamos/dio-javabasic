import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livros = new ArrayList<>();

    public void adcionarLivro(String titulo, String autor, int ano){
        livros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> pesquisados = new ArrayList<>();

        for(Livro i : livros){
            if(i.getAutor().equalsIgnoreCase(autor)){
                pesquisados.add(i);
            }
        }

        return pesquisados;
    }

    public List<Livro> pesquisaTitulo(String titulo){
        List<Livro> pesquisados = new ArrayList<>();

        for(Livro i : livros){
            if(i.getTitulo().equalsIgnoreCase(titulo)){
                pesquisados.add(i);
            }
        }

        return pesquisados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int a, int b){
        List<Livro> pesquisados = new ArrayList<>();

        int menor = a;
        int maior = b;

        if(a > b){
            maior = a;
            menor = b;
        }

        for(Livro i : livros){
            if(i.getAno() >= menor && i.getAno() <= maior){
               pesquisados.add(i); 
            }
        }

        return pesquisados;
    }
}
