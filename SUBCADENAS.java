/**PROGRAM NAME:  FIBONACCI SERIES 
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: this proyect is about how calculate the fibonacci series of any number
*/
package subcadenas;

import java.io.*;
/**
 *
 * @author julian david tobar
 */
public class SUBCADENAS {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        /*************************************
         * variable declarations and assigments
         * ***********************************
         */
        //the variables that are going to be used are declared
        char [] Arraycadena;
        char caracter;
        int contador = 0;
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        /**************************************
         * OUTPUTS
         * ***********************************
         */
        String cadena = " ";
        // the character is asked for console 
        bw.write("Type the phrase you want:   ");
        bw.flush();
        cadena = br.readLine();
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i<Arraycadena.length; i++){
            caracter = Arraycadena[i];
            for (int j = 0; j<Arraycadena.length; j++){
                if(Arraycadena [j] == caracter){
                    contador ++;    
                }
            }
            bw.write("\n"+Arraycadena[i]+"  "+ contador);
            bw.flush();
            contador = 0;
        }
        
    }
    
}
