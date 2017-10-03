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
        
        /*Cada vez que se inserta un valor se imprimen todos los valores del
        arreglo hasta llegar a insertar el último valor e imprimir todos los 
        valores*/
        
        //Creamos un array de tamaño 10
        int aiMisNum[]= new int[10];
        
        /*Utilizamos un for each para llemar el array aleatoriamente
        con números del 1 al 10*/
        for (int i = 0; i < 10; i++) {
            aiMisNum[i] = (int)(Math.random()*10)+1;
            for(int x: aiMisNum){  //int x; for(int i = 0; i<10; i++){}
                System.out.println(" x = " + x);
                
        }
            System.out.println("");
            //MULTIPLES ARREGLOS
            int[] aiArreglo1, aiArreglo2,aiArreglo3; //TODOS SON ARREGLOS
            aiArreglo1 = new int[3]; //Arreglo de tamaño 3
            aiArreglo2 = new int [10];//Arreglo de tamaño 10
            aiArreglo3 = new int [100];//Arreglo de tamaño 100
            
            //ARREGLO Y VARIABLES 
            int aiArre[], iVar, iVar2;//REFERENCIA A MEMORIA
            aiArre = new int[10];
            iVar = 10;
            iVar = 30;
        }
    }
    
}
