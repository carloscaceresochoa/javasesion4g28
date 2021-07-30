
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculadora();
    }
    
    public static void menu(){
        System.out.println("****************************");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.println("****************************");
    }
    
    public static void calculadora(){
        int op;
        Scanner teclado=new Scanner(System.in);
        do{
           menu();
           System.out.println("Digita la Opción");
           op=teclado.nextInt();
            
        }while(op>=1 && op<=4);
    }
    
}
