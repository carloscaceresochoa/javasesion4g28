
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        doctorStrangeZonaOscura();
        
    }
    
    public static void doctorStrangeZonaOscura(){
      Scanner teclado=new Scanner(System.in);
      char aceptar='n';
      int cont=0;
      while(aceptar!='s'){
          System.out.println("Doctor Strange: Dormamu Vengo Hace un Trato");
          System.out.println("Aceptas mi Condición");
          aceptar=teclado.nextLine().toLowerCase().charAt(0);
          if(aceptar!='s'){
            System.out.println("Doctor Extange Muere");
            cont++;
          }
          if(cont==4){
              System.out.println("Dormamu: Liberar de este Bucle de Tiempo");
          }
              
      }
        
        
    }
    
}
