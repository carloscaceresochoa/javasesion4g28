
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leerNumeros();
    }
    
    public static void leerNumeros(){
        int n=1;
        int contpar=0;
        int contimpar=0;
        Scanner teclado=new Scanner(System.in);
        while(n!=-99){
            System.out.println("Digite un Numero");
            n=teclado.nextInt();
            if(n!=-99){
                if(n%2==0){
                    contpar++;
                }
                else{
                    contimpar++;
                }
            }
        }
        System.out.println("Numeros Pares Digitados "+contpar);
        System.out.println("Numeros Impares Digitados "+contimpar);
    }
    
}
