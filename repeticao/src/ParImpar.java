public class ParImpar {
    public static void main (String [] args){

        for(int i = 1; i <= 100; i++){
            if(i%2 == 0)
                System.out.println("O numero " + i + " é par!");
            else
                System.err.println("O numero " + i + " é impar");
        }
    }
}
