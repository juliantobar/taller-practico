/**PROGRAM NAME:  factorial 
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: this project is about how to get a factorial of anynumber. 
*/
package factorial;

import java.io.*;
/**
 *
 * @author julian david tobar
 */
public class Factorial 
{
public static int factorial(int num)
{
    // base case
    if (num==0)
    {
        return 1;
    }
    // general case
    else
    {
        return num * factorial(num-1);
    }
}
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
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int number;
        /**************************************
         * OUTPUTS
         * ***********************************
         */
        // the number is asked for console  
        bw.write("\nwhat is the number:    ");
        bw.flush();
        number=Integer.parseInt(br.readLine());
        //the result comes out by console
        bw.write("\nfactorial of  " + number + " is " + factorial(number));
       bw.flush();
       //Ej.: the factorial of 5 is: 5*4*3*2*1=120
    }
    
}
    
    

