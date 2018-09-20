/**PROGRAM NAME:  calculator 
 * PROGRAM AUTHOR: Julian Tobar
 * Date: september,19 2018
 * description: this project is about a calculator that does basic opeerations, squere root and  potentation. 
*/
import java.io.*;


public class calculadora {
    public static void main(String args[]) throws IOException{
        /*************************************
         * variable declarations and assigments
         * ***********************************
         */
        //the variables that are going to be used are declared
        int numberone, numbertwo, total;
        int Oper ;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
       
        /**************************************
         * OUTPUTS
         * ***********************************
         */
       
        //a menu is displayed on the console to choose the operation
        bw.write("\n1) equal");
        bw.write("\n2) subtrac");
        bw.write("\n3) Divide");
        bw.write("\n4) Multiplication");
        bw.write("\n5) exPonentiation");
        bw.write("\n6) square root");
        bw.write("\n0) exit");

        bw.write("\nin case of being exPonentiation the number two is assumed as an exponent");
        bw.write("\nenter the option");
        bw.flush();


  // the user's option is received
        Oper = Integer.parseInt(br.readLine());
  // the number is asked for console   
        bw.write("\nenter  number one");
            numberone=Integer.parseInt(br.readLine());
//the second number is asked for console
        bw.write("\nenter number two");
            numbertwo=Integer.parseInt(br.readLine());

        bw.flush();
//after having the operator and the two numbers to operate
//the case is chosen according to the operator and the operation is performed
    switch(Oper){
       case 1: total= numberone + numbertwo;
        bw.write("\nhe  result of the equal is: "+total);
       break;
       case 2: total=numberone - numbertwo;
        bw.write("\nhe  result of the subtrac is: "+total);
       break;
       case 3: total=numberone / numbertwo;
        bw.write("\nthe  result of the divide is: "+total);
       break;
       case 4: total= mult (numberone,numbertwo);
        bw.write("\nthe  result of the multiplication is: "+total);
       break;
       case 5: total= pot (numberone,numbertwo);
        bw.write("\nthe  result of the exponentiation  is: "+total);
       break;
       case 6: total= root(numberone);
        bw.write("\nthe  result of the square root  is: "+total);
       break;
       case 0:
        bw.write("\nleaving");
       break;


       default: bw.write("\nincorrect Optión ");
       break;
}
        bw.flush();
}

public static int pot (int a,int expo)
{
    
 
    if(expo == 0)
        return 1;
    else
       return a *pot(a,expo-1);


}
public static int mult (int a,int b)
{
    
    if( a == 0 || b ==0)
    return 0;
    else 
        if(b==1)
            return a;
        else 
        return a + mult(a,b-1);
       
}
public static int root (double a)
{
    return (int) Math.sqrt(a);
}
}
