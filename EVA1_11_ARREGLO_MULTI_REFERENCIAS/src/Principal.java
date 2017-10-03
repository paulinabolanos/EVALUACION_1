/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArray3D[][][] = new int[10][2][7];//140 ENTEROS
        
        
        //System.out.println(aiArray3D.length); --- FILAS
        //System.out.println(aiArray3D[0].length); --- COLUMNAS
        //System.out.println(aiArray3D[0][0].length); --- NIVELES
        
        //Llenar con números aleatorios entre 1 y 100
        for (int i = 0; i < aiArray3D.length; i++) {//Recorre las filas (10)
            for (int j = 0; j < aiArray3D[i].length; j++) {//Recorre las columnas (2)
                for (int k = 0; k < aiArray3D[i][j].length; k++) {//Recorre los niveles (7)
                    aiArray3D[i][j][k] = (int)(Math.random() * 100) + 1;
                }
            }
        }
        //IMPRIMIR RECORRIENDO FILAS, COLUMNAS Y NIVELES
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.println("[" + aiArray3D[i][j][k] + "]");
                }
            }
        }
    }
    
}
