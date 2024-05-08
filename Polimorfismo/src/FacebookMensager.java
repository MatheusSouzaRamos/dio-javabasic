public class FacebookMensager extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem via Facebook");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem via Facebook");
        salvarHistoricoMensagens();
    }
}
