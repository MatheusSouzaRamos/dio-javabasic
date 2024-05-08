public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando Conexão com Internet");
    }

    protected void salvarHistoricoMensagens(){
        System.out.println("Salvando historico de mensagens");
    }
}
