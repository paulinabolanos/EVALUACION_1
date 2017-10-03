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
        
        //Crear arreglo de tamaño 10 y llenarlo con valores aleatorios del 1 al 100
        int aiArray[] = new int[10];
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int) (Math.random() * 100) + 1;

        }
        /*Para encontrar el número mayor del arreglo utilizaremos un for que 
        recorrerá los datos del arreglo, como buscaremos el valor mayor crearemos
        una variable inicializada en 0 ya que dentro del for tenemos un if que 
        compara cada dato que se recorre con la variable creada anteriormente, 
        si el dato es mayor a la variable entra al if donde el dato recorrido se
        almacena en la variable y después de reccorer todo el arreglo, el número
        mayor se queda almacenado en la variable y la imprimimos */
        int iMayor = 0;
        for (int i = 0; i < aiArray.length; i++) {
            if(aiArray[i] > iMayor){
                iMayor = aiArray[i];
            }
        }
        System.out.println("Mayor: " + iMayor);

        /*Para encontrar el número menor se crea una variable inicializada en 100
        que es el valor máximo que puede tener elemento del arreglo, el for 
        recorrerá los datos del arreglo y los comparará en un if, en el if solo
        entraran los datos menores a la variable creada anteriormente, ya estando
        dentro del if a la variable creada se le asigna el valor del dato recorrido,
        al finalizar el for el valor que quedo en la variable es el número 
        minimo y se imprime */
        int iMenor = 100;
        for (int i = 0; i < aiArray.length; i++) {
            if(aiArray[i] < iMenor){
                iMenor = aiArray[i];
            }
        }
        System.out.println("Menor: " + iMenor);

        System.out.println("");
        for (int i = 0; i < aiArray.length; i++) {
            System.out.print("[" + aiArray[i] + "] ");
        }
    }
    
}
