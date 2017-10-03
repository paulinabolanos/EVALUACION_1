/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulina
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Creamos un objeto de la clase "MiClasePrueba" para utilizar el
        método "imprimir mensaje" e imprimir el atributo */
        MiClasePrueba mcpObjeto = new MiClasePrueba();
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        
        /*En la clase "MiClasePrueba2" no creamos un objeto para utilizar el
        método y el atributo ya que son de tipo estático y podemos accder a ellos,
        si no fuera estático tendriamos que urilizarlos a través de un objeto */
        MiClasePrueba2.imprimirMensaje();
        MiClasePrueba2.sNom = "Paulina";
        System.out.println(MiClasePrueba2.sNom);
    }
    
}

//Creamos una clase con un atributo y un método
class MiClasePrueba{
    public String sNom = "Paulina Bola";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}

//Creamos una clase con un atributo y un método de tipo estático
class MiClasePrueba2{
    public static String sNom = "Paulina Bola";
    public static void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}
