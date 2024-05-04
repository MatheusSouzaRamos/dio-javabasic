import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("\nDados:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("idade: " + idade);
        System.out.println("Altura: " + altura);   
        
    }


}