public class SistemaIbge {
    public static void main (String [] args){
        for(EstadosBrasieleiros e : EstadosBrasieleiros.values()){
            System.out.println(e.getNomeMaiusculo() + " - " + e.getSigla());
        }

        EstadosBrasieleiros eb = EstadosBrasieleiros.SAO_PAULO;
        System.out.println("\n" + eb.getNomeMaiusculo() + " - " + eb.getSigla());
    }
}
