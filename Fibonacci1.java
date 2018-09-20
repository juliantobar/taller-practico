/**PROGRAM NAME:  FIBONACCI SERIES 
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: this project is about how calculate the fibonacci series of any number
*/
package fibonacci1;

/**
 *
 * @author julian david tobar
 */

import java.io.*;

public class Fibonacci1 
{
    public static int serie(int num)
    {
        // base cases
        if (num ==1 || num==0)
        {
            return 1;
        }
        //GENERAL CASE
        else 
        {
           return serie(num-1) + serie (num-2);   
        }
    }
    public static void main(String[] args) throws IOException 
    {
        /*************************************
         * variable declarations and assigments
         * ***********************************
         */
        //the variables that are going to be used are declared
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int number;
        int x =0;
       /**************************************
         * OUTPUTS
         * ***********************************
         */
       // the number is asked for console 
       bw.write("\nenter number : ");
       bw.flush();
       number=Integer.parseInt(br.readLine());
       //cycle to print each number when performing the series process
       while(x!=number)
       {
            bw.write("\n  "+ serie(x));
            x++;
       }
       
            bw.flush();
    }
    
}
