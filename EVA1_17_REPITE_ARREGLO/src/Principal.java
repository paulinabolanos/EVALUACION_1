
import java.util.Scanner;

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
        
         int inArray [];
        //PREGUNTAR CUANTOS DATOS
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("¿Cuántos datos ingresara?");
        int iNumDatos = sCaptu.nextInt();
        //CREAR EL ARRAY 
        inArray = new int [iNumDatos];
        
        //LLENAR EL ARRAY
        for (int i = 0; i < inArray.length; i++) {
            System.out.println("Ingrese el dato: ");
            inArray[i] =sCaptu.nextInt();        
        }
        //PREGUNTAR EL DATO QUE SE DESEA BUSCAR
        /*Se le pregunta al usuario cual es el dato que desea buscar y se
        almacena en la variable iNumero*/
        int iNumero;
        System.out.println("¿Cúal número desea buscar?");
        iNumero = sCaptu.nextInt();
        
        //BUSCAR DATO REPETIDO
        /*Para saber cuantas veces se repite el dato que el usuario capturo
        desde el teclado, primeramente creamos un contador inicializado en 0.
        
        Recorremos el arreglo con un for, cada dato del arreglo despúes de
        entrar al for entrará a un if donde se compara el dato del arreglo con 
        el dato que el usuario desea buscar, si los datos comparados son 
        diferentes no entran al if y sigue el for, pero si los datos comparados
        son iguales entran al if donde se le sumara 1 al contador.
        
        Después de recorrer todos los datos del arreglo se imprime el contador
        ya que ahí se almacenan las veces que se repitio el número que el 
        usuario deseaba buscar.*/
        int count = 0;
        for (int i = 0; i < inArray.length; i++) {
            if( iNumero == inArray[i]){
               count ++;
               //System.out.println(i + 1); 
            }
            
        }
        System.out.println("");
        System.out.println("Se repite " + count + " veces");
    }
    
}
