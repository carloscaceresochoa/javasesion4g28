
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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;
        int contpar=0;
        int contimpar=0;
        Scanner teclado=new Scanner(System.in);
        for(i=1;i<=5;i++){
            System.out.println("Digite n");
            n=teclado.nextInt();
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
    
}
