
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
        int aiArray2D [][]; //array de dos dimensiones - null
        //Definimos primero las filas (grupos)
        //preguntar el numero de grupos
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("Número de grupos: ");
        int iNoGpo = sCaptu.nextInt();
        //cantidad de grupos
        aiArray2D = new int [iNoGpo][]; //N grupos
        //Para cada grupo, preguntar el número de alumnos
        int iNoAlu;
        for (int i = 0; i < iNoGpo; i++) {
            //PREGUNTAR EL NÚMERO DE ALUMNOS
            System.out.println("Número de alumnos para el grupo " + (i + 1) + ":");
            iNoAlu =sCaptu.nextInt();
            aiArray2D[i] = new int[iNoGpo];
        }
        //PEDIR LOS DATOS
        for (int i = 0; i < iNoGpo; i++) {//FILAS ---> GRUPOS
            for (int j = 0; j < aiArray2D[i].length; j++) {
                System.out.println("Edad Grupo " + (i + 1) + ":");
               aiArray2D[i][j] = sCaptu.nextInt();
            }
        }
         //CALCULAR LOS PROMEDIOS
        int iAcum;
        double dProm;
        for (int i = 0; i < aiArray2D.length; i++) {//FILAS ---> GRUPOS
            iAcum = 0;
            dProm = 0;
            for (int j = 0; j < aiArray2D[i].length; j++) {
                iAcum += aiArray2D[i][j]; //sumatoria de todas las edades
            }
            dProm = iAcum / aiArray2D[i].length;
            System.out.println("Para el grupo " + (i + 1) + ", el promedio de " + "edad es: " + dProm);
        }
        
        
        // TODO code application logic here
        /*int aiArray2D [][] =new int[4][];//aRREGLO DE DIMENSIONES - NULL
        aiArray2D[0] = new int [30];
        aiArray2D[1] = new int[5];
        
        //PREGUNTAR CUANTOS GRUPOS
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantos grupos se van a capturar");
        int iTam = sCaptu.nextInt(); //CANTIDAD A CAPTURAR
        //INICIALIZAR EL ARREGLO
        int iGrupos[][] = new int [iTam][];*/
    }
    
}
