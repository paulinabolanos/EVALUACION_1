
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
        
        //PREGUNTAR CUANTAS EDADES SE VAN A CAPTURAR
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar");
        int iCant = sCaptu.nextInt(); //CANTIDAD A CAPTURAR
        
        //INICIALIZAR EL ARREGLO
        /*El tamaño con el cual se inicializara el arreglo es el capturado 
        desde el teclado por el usuario, en este caso guardado en la variable
        "iCant"*/
        int aiEdades[] = new int [iCant];
        
        //CAPTURAR
        /*Para llenar el arreglo utilizaremos un for el cual recorre cada 
        posición del arreglo, en cada posición se colocara el dato capturado
        desde el teclado por el usuario*/
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad: ");
            aiEdades[i] = sCaptu.nextInt();
        }
        //CALCULAR EL PROMEDIO DE EDADES
        int iAcum = 0;
        /*En la variable iAcum se almacenara la suma de todos los números
        conforme los recorra el for each*/
        for (int iVal : aiEdades) {
            iAcum = iAcum + iVal; //iAcum += iVal; EQUIVALENTE
        }
        
        /*En la variable dProm se realiza la operacion para calcular el 
        promedio, se divide la suma de todos los datos del arreglo entre la 
        cantidad de datos */
        double dProm = iAcum/iCant;
        //Imprimir resultado
        System.out.println("El promedio es: " + dProm);
    }
    
}
