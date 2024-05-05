public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("12345678");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
            throw new CepInvalidoException();

            //simulando formatação
            return "12.34.567-8";

    }
    
}
