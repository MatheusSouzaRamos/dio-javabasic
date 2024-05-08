public class MSNMensager {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem(){
        System.out.println("Recendo mensagem");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico de mensagens");
    }
}
