public class Festa {
    public static void main (String [] args){
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());

        convidados.adicionarConvidado("Matheus", 123);
        convidados.adicionarConvidado("Maria", 321);
        convidados.adicionarConvidado("Jose", 456);
        convidados.adicionarConvidado("Fabio", 654);
        convidados.adicionarConvidado("Fatima", 789);
        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigo(654);
        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());

        //hash e equals
        convidados.adicionarConvidado("ana", 111);
        convidados.adicionarConvidado("ana", 111);
        convidados.adicionarConvidado("ana", 111);
        convidados.adicionarConvidado("ana", 111);
        convidados.adicionarConvidado("ana", 111);
        convidados.adicionarConvidado("ana", 111);
        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());
    }
    
}
