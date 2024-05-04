package edu.matheus.exercicio;

public class SmartTv {
    
     boolean ligada = false;
     int volume = 50;
     int canal = 50;

     public void ligar(){
          ligada = true;
     }

     public void desligar(){
          ligada = false;
     }

     public void aumentarVolume(){
          volume = (volume>=0 && volume<100)? volume+1 : 100;
     }

     public void diminuirVolume(){
          volume = (volume<=100 && volume>0)? volume-1 : 0;
     }

     public void passarCanal(){
          canal = (canal >=0 && canal < 100) ? canal+1 : 0;
     }

     public void voltarCanal(){
          canal = (canal <= 100 && canal >0)? canal-1 : 100;
     }

     public void setCanal(int n){

          if(n>=0 && n<=100)
               canal = n;
          else
               canal = (n<0) ? 0 : 100;
     }

     public void print(){
          System.out.println("Ligada/Desligada ? " + ligada);
          System.out.println("Canal Atual: " + canal);
          System.out.println("Volume Atual: " + volume);
     }

     /*
    public static boolean power(boolean b){
        return b?false:true;
    }

   public static int aumentarVolume(int volume){
        return (volume>=0 && volume<100)? volume+1 : 100;
   }

   public static int diminuirVolume(int volume){
        return (volume<=100 && volume>0)? volume-1 : 0;
   }

   public static int passarCanal(int canal){
        return (canal >=0 && canal < 100) ? canal+1 : 0;
   }

   public static int voltarCanal(int canal){
        return (canal <= 100 && canal >0)? canal-1 : 100;
   }

   */

}
