/**PROGRAM NAME:  PALINDROME
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: THIS PROJECT IS ON HOW TO VERIFY IF A CHAIN ​​OR WORD 
                IS WRITTEN IN THE SAME WAY TO THE RIGHT OR BACKWARDS.
*/
package palindromo;
import java.io.*;
/**
 *
 * @author julian david tobar
 */
public class Palindromo {
public static void main(String[] args) {
 
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		try
		{
		//THE CHAIN ​​IS RECEIVED BY CONSOLE
		bw.write("enter the characters:   ");
		bw.flush();
		String c = br.readLine();
		StringBuilder chain_to_buffer = new StringBuilder(c);
		StringBuilder na= chain_to_buffer.reverse(); 

		StringBuilder sbuf = new StringBuilder(na); 
		String cadreversaenstring = sbuf.toString(); 

		bw.write(c + "\n");
		bw.flush();
		
		
		if(c.equals(cadreversaenstring)) { 
		bw.write("\n"+ cadreversaenstring+ " is palindrome");
		bw.flush();
		}
		else {
		bw.write("\n"+ cadreversaenstring + "  isn't palindrome ");
		bw.flush();
		}
		}
		catch (IOException ex) {}
		}
}


