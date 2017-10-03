
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
        
        //Creamos un arreglo de tipo String y lo llenamos con los meses del año
        String asMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        //Creamos un arreglo de tipo entero el cual lo llenamos con los días de cada mes
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //SOLICITAR EL MES AL USUARIO:
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("NUMERO DE MES (1 - 12):");
        iMes = sCaptu.nextInt();
        
        /*Para imprimir el mes y los días que el usuario solicite le pedimos
        que ingrese el mes que desea buscar conforme al número correspondiente
        por mes, para buscar el mes en el arreglo de los meses le restaremos 1 
        al número ingresado por el usuario ya que las posiciones en un arreglo 
        empiezan desde 0, de igual manera para buscar los días del mes en el 
        arreglo de los días, le restamos 1 al número ingresado por el usuario*/
        System.out.println("El mes es " + asMeses[iMes - 1] + " y tiene " + aiDias[iMes - 1] + " dias");
    }
    
}
