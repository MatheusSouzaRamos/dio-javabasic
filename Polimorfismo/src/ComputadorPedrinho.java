import java.util.Scanner;
import java.util.Locale;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("QUAL APP USAR?");
        String appEscolhido = scanner.next();
        // msn fcb tlg

        if(appEscolhido.equals("msn"))
            smi = new MSNMensager();
        else if(appEscolhido.equals("fcb"))
            smi = new FacebookMensager();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMensager();
        else
            System.out.println("Opção Invalida");

        scanner.close();

        if (smi != null) {
            smi.enviarMensagem();
            smi.receberMensagem();
            smi.validarConectadoInternet();
        }
        
        
    }
}
