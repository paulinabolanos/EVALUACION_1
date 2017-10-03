
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("Introduce el número a analizar: ");
        int iSeraPrimo = sCaptu.nextInt();
        int iResi;
        for (int i = 2; i < iSeraPrimo; i++) {
            iResi = iSeraPrimo % i;
            if(iResi == 0){
                System.out.println("");
                System.out.println("El número no es primo");
                break;
            }   
        }
        
        /*Le pediremos al usuario un número para saber si es número primo o no.
        Usaremos un for que se inicialice en 2, el número dado por el usuario 
        ingresará al for donde se dividirá entre i que inicialmente será 2 pero
        el for lo aumentará hasta llegar al número ingresado por el usuario, si
        al dividirlo entre i el residuo es 0 entonces significa que es divisible
        entre otros números aparte de el mismo lo cual lo descarta de ser primo,
        se imprimirá el mensaje de que el número no es primo y se saldrá del if 
        finalizando el programa, pero si sucede lo contrario el número o
        bviamente será primo.*/
        
    }
    
}
