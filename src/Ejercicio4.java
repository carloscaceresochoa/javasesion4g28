
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      llenarDatos();
    }
    
    public static void llenarDatos(){
        int n,i,limite;
        int contpar=0;
        int contimpar=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite el Limite del Ciclo");
        limite=teclado.nextInt();
        for(i=1;i<=limite;i++){
            System.out.println("Digite n");
            n=teclado.nextInt();
            System.out.println(cuadrado(n));
            System.out.println(potencia(n, 3));
            if(n%2==0){
                contpar++;
            }
            else{
                contimpar++;
            }
        }
        System.out.println("Numero Pares Digitados "+contpar);
        System.out.println("Numero Impares Digitados "+contimpar);
    }
    
    public static int cuadrado(int n){
        return n*n;
    }
    
    public static double potencia(double base,double exponente){
        return Math.pow(base, exponente);
    }
    
}
