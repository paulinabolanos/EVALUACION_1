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
        
        /*Crear las dos matrices que se multiplicarán y la matriz que
        almacena los resultados, todas las matrices de tipo double*/
        double iMatriz1[][] = new double [5][5];//25 Enterod
        double iMatriz2[][] = new double [5][5];//25 Enteros
        double iMatrizR [][] = new double [5][5];//25 Enteros
        
        //LLENAR PRIMER MATRIZ
        //Llenamos la primer matriz con valores aleatorios doubles del 1 al 10
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                iMatriz1[i][j] = (Math.random() * 10);
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                System.out.print("[" + iMatriz1[i][j] + "] ");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
        
        //LLENAR SEGUNDA MATRIZ
        //Llenamos la segunda matriz con valores aleatorios doubles del 1 al 10
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                iMatriz2[i][j] = (Math.random() * 10);
            }
        }
        //IMPRIMIR
        System.out.println("");
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                System.out.print("[" + iMatriz2[i][j] + "] ");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
        
        //LLENAR MATRIZ DE RESULTADOS
        /*Para llenar la matriz que almacenará los resultados se necesitan dos
        for, uno para recorrer filas y otro para recorrer columnas, se multiplicará
        el valor de la matriz 1 y el valor de la matriz 2 que están en la misma 
        posición y el resultado se almacenará en la misma posición pero en la 
        nueva matriz de resultados */
        for (int i = 0; i < iMatrizR.length; i++) {
            for (int j = 0; j < iMatrizR.length; j++) {
                iMatrizR[i][j] = iMatriz1[i][j] * iMatriz2[i][j];
            }
        }
        //IMPRIMIR
         System.out.println("");
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                System.out.print("[" + iMatrizR[i][j] + "] ");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
    }        
}

