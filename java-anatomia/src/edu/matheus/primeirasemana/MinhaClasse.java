package edu.matheus.primeirasemana;

public class MinhaClasse {
    
    public static void main(String [] args ) {

        final String BR = "Brasil";
        final double PI = 3.14;
        int ano = 2024;
        ano = 2025;
        // boolean bo = true;

        String nomeCompleto = nomeCompleto("João", "Pedro");
        int soma = somar(ano, ano);
        double soma2 = somarD(PI, soma);
        String [] emails = {"aluno@escola.com", "professor@escola.com"};

        System.out.println("\nHello, World!");
        System.out.println(BR);
        System.out.println(soma2);
        System.out.println(nomeCompleto);
        System.out.println(soma);
        System.out.println(emails[0]);
        System.out.println(emails[1]);
        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static int somar(int a, int b){
        return a+b;
    }

    public static double somarD(double a, double b){
        return a+b;
    }

}
