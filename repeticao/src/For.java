public class For {
    public static void main (String [] args){

        for(int i = 0; i<10; i++){
            System.out.println("Linha " + (i+1) );
        }

        for(int i = 0; i < 20; i++){
            System.out.println("Contando carneirinhos: " + i);
            if(i == 10)
                System.out.println("Joaozinho esta ficando com sono...");
        }
        System.out.println("Joazinho Dormiu!\n");


        String nomes[] = {"matheus", "joao", "paulo", "jose", "kaique"};
        for(int i = 0; i < nomes.length; i++)
            System.out.println("Nome de indice " + i + " = " + nomes[i]);

        System.out.println("\n");

        for(String i : nomes){
            System.out.println("Nome: " + i);
        }

    } 
}
