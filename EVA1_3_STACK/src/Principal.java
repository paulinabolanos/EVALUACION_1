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
        System.out.println("Llamando a A");
        A();
        System.out.println("Termino llamada a A");
    }
    
    public static void A(){
        System.out.println("Llamando a B");
        B();
        System.out.println("Termino llamada a B");
    }
    
    public static void B(){
        System.out.println("Llamando a C");
        C();
        System.out.println("Termino llamada a C");
    }
    public static void C(){
        System.out.println("FIN DEL CAMINO");
    }
    
}
/*Este código nos muestra el funcionamiento de la pila, primero va metiendo los
datos como se van llamando poniendo uno arriba de otro, para la salida los saca
al revés, primero saca el último que se metió hasta llegar al primer dato que 
se metió*/
