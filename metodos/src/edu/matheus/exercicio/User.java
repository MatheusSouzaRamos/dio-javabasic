package edu.matheus.exercicio;

public class User {

    public static void main(String [] args){

        SmartTv tv = new SmartTv();
        tv.print();

        tv.ligar();
        tv.print();

        tv.aumentarVolume();
        tv.print();
        tv.aumentarVolume();
        tv.print();

        tv.setCanal(31);
        tv.print();


    }
    
   
}
