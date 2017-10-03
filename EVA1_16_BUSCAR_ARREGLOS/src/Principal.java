
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
        
        boolean noDato = true;
        int myArray [];
        //PREGUNTAR CUANTOS DATOS
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("¿Cuántos datos ingresara?");
        int iCantDatos = sCaptu.nextInt();
        //CREAR EL ARRAY 
        myArray = new int [iCantDatos];
        
        //LLENAR EL ARRAY
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Ingrese el dato: ");
            myArray[i] =sCaptu.nextInt();        
        }
        System.out.println("");
        //PREGUNTAR EL DATO QUE SE DESEA BUSCAR
        int iDato;
        System.out.println("¿Cúal dato desea buscar?");
        iDato = sCaptu.nextInt();
        System.out.println("");
        
        /*Para buscar el dato utilizamos un for para recorrer el arreglo, si el
        dato que ingreso el usuario que quiere encontrar coincide con el dato 
        que esta recorriendo el for se imprimira la posición y se saldrá del if.
        
        Para imprimir la posicion le sumamos 1 ya que las posiciones de un 
        arreglo comienzan en 0.
        
        Si no se encuentra el dato lo sabremos y le notificara al usuario, 
        sabemos que el dato no se encuentra mediante una variable de tipo 
        boolean que inicializamos como verdadera en caso de que no se encuentre 
        el dato, si el dato no es encontrado saldremos del for y entraremos a un 
        if si el y si la variable boolean sigue siendo verdadera se imprimira un 
        mensaje avisando al usiario que no se encontro su dato. Por el contrario
        si se encuentra el dato, imprimira la posición y después cambiara la
        variable boolean a falsa, siendo esta variable falsa no entrara al
        último if.*/
        for (int i = 0; i < myArray.length; i++) {
            if( iDato == myArray[i]){
                System.out.println("La posicion es: " + (i+1));
                noDato = false;
                break;
            }
        }
        if(noDato==true){
            System.out.println("No se encontro dato");
        }
        
        
    }
}
        
    
   
