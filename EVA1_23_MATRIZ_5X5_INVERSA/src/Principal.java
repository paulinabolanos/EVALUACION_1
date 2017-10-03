
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREAR MATRIZ
         int aiMatriz[][] = new int [5][5]; //25 ENTEROS
         
        //LLENAR CON VALORES ALEATORIOS DEL 1 AL 100
        //for para filas
        //for para columnas
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                aiMatriz[i][j] = (int)(Math.random() * 100) + 1 ; // llenar 1-100
            }
        }
        
         //IMPRIMIR
        
        //print se mantiene en la linea actual
        //print ln se cambia de lines
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                System.out.print("[" + aiMatriz[i][j] + "] ");}
                System.out.println("");//NOS CAMBIA DE LINEA
        }
        
        //CREAR NUEVA MATRIZ PARA INVERTIR
        /*Para invertir una matriz utilizamos dos for, uno para las filas y otro
        para las columnas, cada for se recorrerá desde la última posición hasta
        la primera para que quede al revés */
        int iMatrizCopia[][]= new int[5][5];
        int count1 = 0;
        int count2 = 0;
        for (int i = iMatrizCopia.length - 1; i >= 0; i--) {//For para invertir cada fila
            count1 =0;
            for (int j = iMatrizCopia.length - 1; j >= 0; j--) {//For para invertir cada columna
                iMatrizCopia[count2][count1]=aiMatriz[i][j];
                count1 ++;
            }
            count2 ++;
        }
        
        System.out.println("");
        //IMPRIMIR MATRIZ INVERSA
        for (int i = 0; i < 5; i++) {//recorrer cada fila
            for (int j = 0; j < 5; j++) {//cada columna
                System.out.print("[" + iMatrizCopia[i][j] + "] ");}
                System.out.println("");//NOS CAMBIA DE LINEA
        } 
    }
}
