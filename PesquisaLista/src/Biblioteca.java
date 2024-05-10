import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String [] args){
        CatalogoLivros catalogo = new CatalogoLivros();
        List<Livro> pesquisas = new ArrayList<>();

        catalogo.adcionarLivro("Livro1", "AutorA", 1010);
        catalogo.adcionarLivro("Livro2", "AutorA", 1012);
        catalogo.adcionarLivro("Livro3", "AutorB", 1011);
        catalogo.adcionarLivro("Livro4", "AutorC", 1050);

        pesquisas = catalogo.pesquisaAutor("AutorA");
        System.out.println(pesquisas);

        pesquisas = catalogo.pesquisaTitulo("Livro3");
        System.out.println(pesquisas);

        pesquisas = catalogo.pesquisarPorIntervaloAnos(1000, 2000);
        System.out.println(pesquisas);

        // ===============
        // System.out.println(catalogo.pesquisaAutor("AutorC"));

    }
}
