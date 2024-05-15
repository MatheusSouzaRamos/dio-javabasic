public class TelefoneCelular {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("matheus", 123);
        agenda.exibirContatos();
        agenda.atualizarNumero("matheus", 123, 321);
        agenda.exibirContatos();

        agenda.adicionarContato("Maria", 9090);
        agenda.adicionarContato("Jose", 9191);
        agenda.exibirContatos();

        agenda.adicionarContato("ana", 1111);
        agenda.adicionarContato("ana", 1111);
        agenda.exibirContatos();

        agenda.atualizarNumero("ana", 111, 122);
        agenda.adicionarContato("aninha", 333);
        agenda.exibirContatos();

        System.out.println("\n");

        agenda.adicionarContato("camila 1", 1);
        agenda.adicionarContato("camila 2", 2);
        agenda.adicionarContato("camila 3", 3);
        agenda.adicionarContato("camila 4", 4);
        System.out.println(agenda.pesquisaPorNome("camila"));

    }
}
