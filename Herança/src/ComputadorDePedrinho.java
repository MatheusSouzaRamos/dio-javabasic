public class ComputadorDePedrinho {
    public static void main (String [] args){
        MSNMensager msn = new MSNMensager();
        FacebookMensager fcb = new FacebookMensager();
        Telegram tlg = new Telegram();

        msn.enviarMensagem();
        msn.receberMensagem();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
