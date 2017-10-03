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
        
        //Creamos una matriz de 2X2 
        int aiMatriz[][] = new int [10][10]; //100 ENTEROS
        //for para filas
        //for para columnas
        
        /*Para hacer una matriz identidad solo la línea diagonal desde la 
        primera posición hasta la última debe tener el número 1, las demás 
        posiciones deben tener 0.
        
        Las posiciones en diagonal que deben tener 1 son las que coinciden su
        valor en fila y su valor en columna. Ejemplo:[0][0],[1][1],[2][2],[3][3]
        Usamos dos for, el primero para recorrer las filas y el segundo para 
        recorrer las columnas.
        
        Dentro de ambos for utilizamos un if que compara la posición de la fila
        con la posición de la columna, si ésta coincide le asigna el valor 1,
        pero si no coinciden le asigna el valor 0.
        */
        for (int i = 0; i < 10; i++) {//recorrer cada fila
            for (int j = 0; j < 10; j++) {//cada columna
                if( i == j){
                    aiMatriz[i][j] = 1;
                }else{
                    aiMatriz[i][j] = 0;
                }
            }
        }
        
         //IMPRIMIR
        
        //print se mantiene en la linea actual
        //print ln se cambia de lines
        for (int i = 0; i < 10; i++) {//recorrer cada fila
            for (int j = 0; j < 10; j++) {//cada columna
                System.out.print("[" + aiMatriz[i][j] + "] ");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
    }
    
}
