public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("12909321039");

        Moto motoca = new Moto();
        motoca.ligar();
        motoca.setChassi("90139024035");

        //Veiculo coringa = motoca;
        //Veiculo coringa = jeep;
        
        
    }
}
