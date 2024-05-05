import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main (String [] args){

        double mesada = 50;
        double totalCorrente = 0;

        while(mesada > 0 ){
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            if(mesada > valorDoce){
                mesada = mesada - valorDoce;
                totalCorrente = totalCorrente + valorDoce;
                System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho");
                System.out.println("Total corrente: " + totalCorrente + "\n");
            }

        }

    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
