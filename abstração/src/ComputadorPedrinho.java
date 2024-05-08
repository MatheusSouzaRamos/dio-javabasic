public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMensager msn = new MSNMensager();
        FacebookMensager fcb = new FacebookMensager();
        TelegramMensager tlg = new TelegramMensager();

        msn.enviarMensagem();
        msn.receberMensagem();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
