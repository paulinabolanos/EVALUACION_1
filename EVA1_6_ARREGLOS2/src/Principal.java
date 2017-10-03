
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
    public static final int TAMA_ARRE = 5;
    /* TAMA_ARRE se definio como estático para no modificar su valor
    y que siempre sea el mismo valor*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos un arreglo con el tamaño definido como estático
        int aiEdad[];
        aiEdad = new int [TAMA_ARRE];
        
        //Llemanos el arreglo con edades capturadas desde el teclado
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("introduce una edad ");
            aiEdad[i] = sCaptu.nextInt();
            
        }
        
        System.out.println("");
        //IMPRIMIR
        //Imprimimos las edades que introducimos con un for each
        for(int x: aiEdad){
            System.out.println("Edades " + x);
        } 
        
        //CREAR DUPLICADO
        int aiCopiaEdad[];
        //aiCopiaEdad = aiEdad;   NO CREA UN DUPLICADO
        /*Creamos otro arreglo para ahí almacenar los datos del arreglo original
        y crear nuestra copia*/ 
        aiCopiaEdad = new int [TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            aiCopiaEdad[i] = aiEdad[i];
            
        }
        //Usamos un for each para imprimir la copia
        System.out.println("");
        for(int x: aiCopiaEdad){
            System.out.println("Copia Edad = " + x);
        }
        
        /*Imprimimos los arreglos para conocer su dirección de memoria, si la
        dirección es diferente si creamos una copia, pero si la dirección es 
        igual entonces tenemos el mismo arreglo y no está copiado*/
        System.out.println("");
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
        
    }
    
}
