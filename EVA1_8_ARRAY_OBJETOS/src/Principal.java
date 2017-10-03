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
        Alumno aaDatosAlumno[]; //el identificador es nulo
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de tamaño 10. Alumnos - AQUI HABRA PREGUNTA
        
        /*Llenamos el arreglo con un for donde pondremos el objeto en cada
        posición hasta llenar el arreglo*/
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Paulina Bola", "16550405", 0);
            
        }
        
        //Usamos un for each para imprimir el arreglo
        for(Alumno aaDatosAlumno1 : aaDatosAlumno){
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatri());
            System.out.println("Carrerra: " + aaDatosAlumno1.getiCar());
            System.out.println("");
        }
        
        //Creamos una copia del arreglo que creamos anteriormente
        Alumno aaDatosAlumnoCopia[];
        aaDatosAlumnoCopia = new Alumno [aaDatosAlumno.length];
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumnoCopia[i] = aaDatosAlumno[i];
        }
        
    }
    
}

//Creamos una clase de la cual crearemos un objeto para agregarlo a un array
//0 --> SISTEMAS
class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;

    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
    
    
}
