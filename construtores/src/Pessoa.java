public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public static void main(String[] args) {
        
    }
    // construtor / destrutor

    public Pessoa(String nome, String cpc, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // set

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    // get 

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

}
