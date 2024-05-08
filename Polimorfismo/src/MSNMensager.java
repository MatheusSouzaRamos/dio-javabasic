public class MSNMensager extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem via MSN");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem via MSN");
        salvarHistoricoMensagens();
    }
}
