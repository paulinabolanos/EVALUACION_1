
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
        //Creamos 3 variables de distintos tipos String, entero y double
        String sNom;
        int iEdad;
        double dSalario;
        
        Scanner sScanner = new Scanner(System.in);
        
        //Llenamos cada una de las variables con datos desde el teclado
        System.out.println("¿Cuál es tu nombre?");
        sNom = sScanner.nextLine();
        
        System.out.println("");
        System.out.println("¿Cuál es tu edad?");
        iEdad = sScanner.nextInt();
        
        System.out.println("");
        System.out.println("¿Cuál es tu salario?");
        dSalario = sScanner.nextDouble();
        
        /*Mandamos llamar al método y en los parámetros del método se 
        introducirán las variables que creamos y que llenamos con datos 
        capturados desde el teclado */
        hacerAlgo(sNom, iEdad, dSalario);
    }
    
    /*Creamos un método de tres parámetros de distintos tipos String, entero y
    double, éste método imprime cada uno de los datos*/
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println("Nombre: " + sNombre + ", Edad: " + iEdad + ", Salario: " + dSalario);
    }
    
}
