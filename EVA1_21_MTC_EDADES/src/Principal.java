
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

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PREGUNTAR CUANTAS EDADES SE VAN A CAPTURAR
        Scanner iDatos = new Scanner(System.in);
        System.out.println("¿Cuantas edades se van a capturar?");
        int iNoEdades = iDatos.nextInt(); //CANTIDAD A CAPTURAR
        System.out.println("");
        //INICIALIZAR EL ARREGLO
        int aiEdades[] = new int [iNoEdades];
        //CAPTURAR
        for (int i = 0; i < iNoEdades; i++) {
            System.out.println("Introduce la edad: ");
            aiEdades[i] = iDatos.nextInt();
        }
        System.out.println("");
        
        //CALCULAR MEDIA
        int iAcum = 0;
        for (int iVal : aiEdades) {
            iAcum = iAcum + iVal; //iAcum += iVal; EQUIVALENTE
        }
        double media = iAcum/iNoEdades;
        System.out.println("El promedio es: " + media);
        System.out.println("");
        /*Para calcular la media inicializamos una variable en 0 que es donde 
        se almacena la suma de todas las edades. Usamos un for para recorrer 
        cada dato, lo sumamos y lo almacenamos en la variable que contiene las 
        edades sumadas, despúes de tener todas las edades sumadas las dividimos 
        entre el número de edades*/
        
        //CALCULAR MODA
        int iVecesMax = 0;
        int moda = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            int iVeces = 0;
            for (int j = 0; j < aiEdades.length; j++) {
                if(aiEdades[i] == aiEdades[j])
                    iVeces ++;
            }
            if(iVeces > iVecesMax){
                moda = aiEdades[i];
                iVecesMax = iVeces;
            }
        }
        System.out.println("La moda es: " + moda + " y se repite " + iVecesMax + " veces");
        System.out.println("");
        
        //CALCULAR DESVIACIÓN ESTÁNDAR
        double sum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            double resta = aiEdades[i] - media;
            double cuadrado = resta * resta;
            sum = sum + cuadrado;
        }
        double varianza = sum / (iNoEdades - 1);
        double desviacion = Math.sqrt(varianza);
        System.out.println("La desviación estándar es: " + desviacion);
        /*Para calcular la desviación estándar utilizamos un for que recorra 
        cada dato, a cada dato que recorre le resta la media y lo eleve al 
        cuadrado multiplicandolo por si mismo, éste resultado lo almacena en 
        una variable que inicializamos en 0, al finalizar el for la variable que
        almaceno la suma de los datos restados y elevados al cuadrado se divide
        entre el número de datos menos 1.
        Para obtener la desviación sacamos la raíz cuadrada de la división 
        anterior */
    }
    
}
