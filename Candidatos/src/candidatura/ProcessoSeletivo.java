package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //selecionarCandidatos();
        //imprimirSelecionados();

        String [] candidatos = {"Felipe","Marcia","Julio","Paulo","Augusto"};

        for(String candidato : candidatos){
            System.out.println("Entrando em contato com " + candidato);
            entrandoEmContando(candidato);
        }

    }

    static void entrandoEmContando(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            if(atendeu == true){
                continuarTentando = false;
                System.out.println("Contato Realizado com sucesso com " + tentativasRealizadas + " tentativas");
            }
            else{
                tentativasRealizadas++;
                if(tentativasRealizadas == 3 )
                    System.out.println("Falha no contato");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julio","Paulo","Augusto"};
        for(int i = 0; i < 5; i++){
            System.out.println("Candidato de n" + i + " selecionado: " + candidatos[i] );
        }
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Julio","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int canditadosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(canditadosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendito = salarioPretendito();

            if(salarioBase >= salarioPretendito){
                System.out.println("O candidato: " + candidato + " solicitou: " + salarioPretendito);
                System.out.println("O candidato " + candidatoAtual + " foi selecionado " + candidatos[candidatoAtual]);
                canditadosSelecionados++;
            }

            candidatoAtual++;
        }

    }

    static double salarioPretendito(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000;

        if(salarioBase > salarioPretendito){
            System.out.println("Ligar para candidato");
        } 
        else if(salarioBase == salarioPretendito){
            System.out.println("Ligar para candidato com contraproposta");
        }else{
            System.out.println("Aguardando demais resultados");
        }
    }
}