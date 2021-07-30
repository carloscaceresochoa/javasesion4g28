
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        recorrerDatos();
    }
    
        
    public static int promedio(int suma,int total){
        return suma/total;
    }
    
    public static void recorrerDatos(){
        Scanner teclado=new Scanner(System.in);
        int n,i,limite,prom;
        int suma=0;
        System.out.println("Digite el Limite del Ciclo");
        limite=teclado.nextInt();
        for(i=1;i<=limite;i++){
            System.out.println("Digite n");
            n=teclado.nextInt();  
            suma+=n;
        }
        prom=promedio(suma, limite);
        System.out.println("Promedio "+prom);
    }
    
}
