import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {  
    public static void main (String [] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;

        System.out.println("Saldo : " + saldo + "\nDigite o valor para saque: ");
        double saque = scanner.nextDouble();

        if (saldo > saque)
            saldo = saldo - saque;
        else
            System.out.println("Saldo insuficiente!");
        
        System.out.println("Saldo atual: " + saldo);

        scanner.close();
    }

}
