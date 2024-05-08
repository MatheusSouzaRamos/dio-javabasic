public class TelegramMensager extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem via Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem via Telegram");
        salvarHistoricoMensagens();
    }
}
