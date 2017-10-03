
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
        
        /*Creamos una matriz 2X2 de tipo String que almacena las diferentes 
        temperaturas en el estado de Chihuahua*/ 
        String iMatrizTemp [][] = {{"30.0", "32.0", "34.0", "38.8", "39.6", "41.4", "41.6", "39.2", 
            "39.0", "35.0", "34.6", "29.0"},{"18.1", "21.2", "24.2", "27.9", "32.2", "34.0", "32.1", "30.3",
            "29.2", "26.8", "21.9", "18.2"}, {"10.0", "12.9", "15.7", "19.2", "23.6", "26.3", "25.6", 
            "4.3", "22.6", "18.7", "13.7", "10.3"}, {"2.0", "4.5", "7.1", "10.4", "14.9", "18.6", "19.1", 
            "18.2", "16.0", "10.7", "5.5", "2.4"}, {"−12.8", "−18.0", "−5.8", "−3.4", "3.8", "6.1", "10.6", 
            "10.0", "3.7", "−2.4", "−6.1", "−11.5"}};
        
        /*Creamos un array de tipo String donde se encuentra el tipo de 
        temperatura, nos ayudara a ubicar el dato que el usuario desea en la matriz*/
        String iMatTemp [] = {"Record high °C", "Average high °C", "Daily mean °C", 
            "Average low °C","Record low °C"};
        
        /*Creamos un array de tipo String donde se encuentran los meses, nos
        dirá de que mes desea saber la temperatura para poder ubicar el dato 
        deseado en la matriz*/
        String asMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        /*Creamos dos variables de tipo entero en las cuales se almacenará el 
        dato que el usuario ingrese desde el teclado (la temperatura que desea 
        saber y el mes del cual desea saber la temperatura)*/
        int iTemp;
        int iMes;
        
        /*Preguntamos al usuario que tipo de temperatura desea saber, pero el 
        dato que ingresará será de tipo entero para maneharlo mejor al 
        momento de buscar el dato en la matriz*/
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Qué temperatira desea saber? (eliga un numero):");
        System.out.println("1.-Record high °C");
        System.out.println("2.-Average high °C");
        System.out.println("3.-Daily mean °C");
        System.out.println("4.-Average low °C");
        System.out.println("5.-Record low °C");
        
        /*Preguntamos al usuario de que mes desea conocer la temperatura 
        registrada y de igual manera se ingresará un dato de tipo entero para 
        localizar mejor el dato que el usuario desea*/
        iTemp = sCaptu.nextInt();
        System.out.println("Escriba el número del mes: (1-12)");
        iMes = sCaptu.nextInt();
        
        /*Para imprimir el dato deseado necesitamos conocer su posición en la 
        matriz.
        La posición en la matriz lo sacamos con los datos que ingresó en usuario,
        para saber la fila tomaremos en cuanta el dato almacenado en la variable
        utilizada para pedir la temperatura que se dea conocer, pero a ese dato 
        ingresado por el usuario se le retara 1, ya que las posiciones de la 
        matriz comienzan desde 0.
        Y para conocer la posición de la columna utilizamos el dato ingresado
        para conocer el mes, de igual manera al dato ingresado por el usuario
        se le restara 1 para ubicarlo en la matriz.
        */
        System.out.println("La temeratura " + iMatTemp[iTemp - 1] + " del mes de "
                + asMeses[iMes - 1] + " es: " + iMatrizTemp[iTemp - 1][iMes - 1] + " °C");
        
    }
}
