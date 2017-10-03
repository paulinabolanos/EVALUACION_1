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
        
        int i =5;
        System.out.println("i = " + i);
        
        //COPIA DE UNA VARIABLE
        //crear una copia de i 
        int icopia = i; //asignamos el valor de i a la variable i copia
        System.out.println("copia de i = " + icopia);
        /*A la variable original i le sumamos 1 y despues imprimimos la copia
        para comprobar si efectivamente se copio la variable i, comprobamos 
        esto si al imprimir la copia se imprime el valor original*/
        i++;
        System.out.println("i++ = " + i);
        System.out.println("icopia = " + icopia);
        
        System.out.println("");
        //COPIA DE UN OBJETO
        //Crear un objeto de la clase Numero
        Numero nVal = new Numero();//creamos el objeto
        System.out.println("valor de n val.i = " + nVal.i);
        Numero nCopiaVal = nVal; //creamos una "copia"
        System.out.println("valor de nCopia = " + nCopiaVal);
        
        System.out.println("");
        //imprimimos nVal y nCopiaVal
        System.out.println("valor de nVal.i = " + nVal.i);
        System.out.println("valor de nCpiaVal.i " + nCopiaVal.i );
        
        System.out.println("");
        // imprimir los objetos 
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        
        /*En realidad no se realizó la copia, solo se copio la direccion donde 
        se encuentra el objeto, si modificamos el valor original el de la copia
        también se modifica porque es el mismo valor*/
        
        System.out.println("");
        //COPIA REAL DE UN OBJETO
        Numero nCopiaReal = new Numero();//Creamos un nuevo objeto
        //Asignamos el valor del objeto original al objero que se creo para almacenar la copia
        nCopiaReal.i = nVal.i;
        //Imprimimos el valor de los dos objetos
        System.out.println("valor de nVal.i = " + nVal.i);
        System.out.println("valor de nCopiaReal = " + nCopiaReal.i);
        System.out.println("");
        
        /*Al objeto original le sumamos 1, después imprimimos el valor de 
        los dos objetos para comprobar si en verdad creamos la copia, sabemos 
        que tenemos la copia por que el objeto original imprimira el nuevo 
        valor, mientras que la copia mostrará el valor original.*/
        
        nVal.i ++;
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaReal.i =" + nCopiaReal.i);
        System.out.println("");
        
        /*Imprimimos los dos objetos para verificar que sean diferentes, lo 
        comprobamos con la direccion de memoria, si son iguales estamos 
        trabajando con el mismo objeto pero si son diferentes son objetos
        separados.*/
        System.out.println("Valor de nVal.i = " + nVal);
        System.out.println("Valor de nCopiaReal.i =" + nCopiaReal);
    }
    
}
//Clase con un atributo de tipo entero con valor "10"
class Numero{
    public int i=10;
}


