
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
        int iArray [];
        //PREGUNTAR CUANTOS DATOS
        Scanner sCaptu = new Scanner (System.in);
        System.out.println("¿Cuántos datos ingresara?");
        int iNoDatos = sCaptu.nextInt();
        //CREAR EL ARRAY 
        //Crear el arreglo con tamaño de acuerdo al dato que el usuario ingrese
        iArray = new int [iNoDatos];
        //LLENAR EL ARRAY
        /*Usamos un for para llenar el arreglo, el cual recorre cada posición,
        en cada posición que recorre se guarda el dato que el usuario ingrese 
        desde el teclado*/
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("Ingrese los datos: ");
            iArray[i] = sCaptu.nextInt();
                  
        }
        
        //IMPRIMIR ARRAY
        for (int i = 0; i < iArray.length; i++) {
            System.out.print("[" + iArray[i] + "]");
        }
        
        /*Creamos otro array del mismo tamaño que el array anterior para 
        invertir el nuevo array creado*/
        int iArrayInv [];
        iArrayInv = new int [iNoDatos];
        
        //INVERTIR ARRAY
        /*Para invertir el array utilizamos un for que reccora el arreglo, el
        for llenara el array pero como será inverso comenzara desde el final, 
        irá restando 1 hasta llehar a 0*/
        int count = 0;
        for (int i = iArray.length - 1; i >= 0; i--) {
            iArrayInv[count] = iArray[i];
            count ++;
            //System.out.println(iArray[i]);
        }
        
        System.out.println("");
        System.out.println("ARRAY INVERSO");
        //IMPRIMIR ARRAY
        for (int i = 0; i < iArrayInv.length; i++) {
            System.out.print("[" + iArrayInv[i] + "]");
        }
    }
    
}
