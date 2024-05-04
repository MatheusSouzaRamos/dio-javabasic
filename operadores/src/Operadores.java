public class Operadores {
    public static void main(String[] args) throws Exception {
        
        // = atribui valor a variaveis
        int a = 12;
        boolean b = true;
        String nome = "matheus";
        // aritimeticos + - * / %

        //soma e concattenação
        String con = nome + 1 + 1 + (1+1+1);
        System.out.println(con);

        String con2 = 1 + 1 + 1 + nome;
        System.out.println(con2);

        //incremento
        int num = 5;
        num = num +1;
        System.out.println(num);
        
        num++;
        System.out.println(num);

        // operador ternario (IF  em unica linha)

        int num1 = 5;
        int num2 = 5;
        String resultado;

        if(num1==num2)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println(resultado);

        // com ? : 

        int num3 = 2;
        int num4 = 3;

        String resultado2 = num3==num4?"Verdadeiro" : "Falso";

        System.out.println(resultado2);

        // && e || ou

        boolean cond1 = true;
        boolean cond2 = false;

        if(cond1 && cond2)
            System.out.println("Condição 'E' Verdadeira");
        else
            System.out.println("Condição 'E' Falsa");

        if(cond1 || cond2)
            System.out.println("Condição 'OU' Verdadeira");
        else
            System.out.println("Condição 'OU' Falsa");



            


    }
}
