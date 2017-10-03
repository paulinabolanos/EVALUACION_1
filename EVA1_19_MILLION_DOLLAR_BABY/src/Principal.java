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
        
        int aiMillion[]= new int [100000000];
        for (int i = 0; i < aiMillion.length; i++) {
            aiMillion[i] = (int) (Math.random() * 100) + 1;
        }
        
        /*Creamos un arreglo de tamaño en millones y lo llenamos con números
        aleatorios del 1 al 100, se realizó con la finalidad de conocer cual
        era el tiempo en que el programa tardaba en llenar dicho arreglo*/
        
    }
    
}
