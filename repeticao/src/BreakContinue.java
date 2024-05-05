public class BreakContinue {
    public static void main(String [] args){

        for(int i = 0; i != 5; i++){
            if(i == 3)
                break;
            System.out.println("Numero: " + i);
        }

        System.out.println("\n");
        
        for(int i = 0; i != 5; i++){
            if(i == 3)
                continue;
            System.out.println("Numero: " + i);

        }
    } 
}
