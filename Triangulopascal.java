/**PROGRAM NAME:  pascal triangle
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: this project is about 
*/
package triangulopascal;
import java.io.*;
/**
 *
 * @author julian david tobar
 */
public class Triangulopascal {

    public static void main (String[] args) throws IOException
	{
         /*************************************
         * variable declarations and assigments
         * ***********************************
         */
        //the variables that are going to be used are declared
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int row;
                int i;
                int[] a = new int[1];
         /**************************************
         * OUTPUTS
         * ***********************************
         */
			bw.write("Enter the number of rows you want to have: ");
			bw.flush();
		 row = Integer.parseInt(br.readLine());
			
			
			
			
			 for (i = 1; i <= row; i++) 
		        {
		            int[] x = new int[i];
		            
		            for (int j = 0; j < i; j++) 
		            {
		                if (j == 0 || j == (i - 1)) 
		                {
		                    x[j] = 1;
		                } else {
		                    x[j] = a[j] + a[j - 1];
		                }
		                bw.write(x[j] + " ");
		            }
		            a = x;
		            bw.write(" " + "\n");
		        }
			bw.flush();
	}
}