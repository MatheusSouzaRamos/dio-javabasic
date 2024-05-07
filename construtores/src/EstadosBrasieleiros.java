public enum EstadosBrasieleiros {

    SAO_PAULO ("Sao Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio De Janeiro", "RJ"),
    BAHIA ("Bahia", "BA");

    private String nome;
    private String sigla;

    private EstadosBrasieleiros(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
