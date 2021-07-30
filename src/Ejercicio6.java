
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leerNumeros();
    }
    
    public static void leerNumeros(){
        int n=1;
        String password="";
        int cont=1;
        Scanner teclado=new Scanner(System.in);
        while(!password.equals("invalido")){
            System.out.println("Digite el password");
            password=teclado.nextLine();
            if(password.equals("123456")){
                System.out.println("Acceso Concedido");
                break;
            }
            else{
                System.out.println("Error de Intento "+cont);
              
                if(cont==3){
                    break;
                }
                  cont++;
            }
        }
    }
    
}
