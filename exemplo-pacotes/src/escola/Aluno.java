package escola;

import java.util.Scanner;

public class Aluno {
    private String nome = "";
    private int idade = 0;

    // nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    //idade

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

}
