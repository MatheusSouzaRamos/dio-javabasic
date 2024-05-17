public class TelefoneCelular {
    public static void main (String [] args){
        AgendaContato contatos = new AgendaContato();

        contatos.exibirContatos();
        contatos.adicionarContato("Matheus", 1);
        contatos.adicionarContato("Maria", 2);
        contatos.adicionarContato("Jose", 3);
        contatos.adicionarContato("Fabio", 4);
        contatos.adicionarContato("Fatima", 5);
        contatos.exibirContatos();

        System.out.println(contatos.pesquisaPorNome("Matheus"));
        
        contatos.removerContato("Fabio");
        contatos.exibirContatos();

        contatos.adicionarContato("Paulo", 777);
        contatos.adicionarContato("Paulo", 888);

        contatos.exibirContatos();
    }
}
