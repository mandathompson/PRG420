/************************************************************************************
* Program:  PRG/420 Week 5 
* Purpose:     Week 5 Coding Assignment
* Programmer:  Amanda Thompson        
* Class:       PRG/420       
* Creation Date:  July 8th 2019
*************************************************************************************
* Program Summary:   
*	This program converts a given date to a string.    
*     	The code includes exception handling for a ParseException. 
************************************************************************************/
package amandathompsonwk5;


import java.util.*;     // wildcard to import all the util. classes 
import java.text.*;     // wildcard to import all the text classes  

public class AmandaThompsonWk5 {


    public static void main(String args[]){
        int a,b,c;		// We define variables of type integer namned a, b, and c. 
        try {			// We set up the try check block. We will be looking for an invalid value for integer c
             a=3;		// Now we assign values to the variables. 
             b=15;
             c=b/a;		// The result of dividing a number by 0 is undefined. Exception!
             System.out.println("This line will not be executed when a=0 because when a=0, the previous line throws an exception to the catch block.");      
        }
        catch(ArithmeticException e) { // As soon as an exception is thrown in the "try" block, execution of this code begins.
             System.out.println("Catching this exception thrown by the try block: " + e); 
        }
       System.out.println("Execution resumes here after both the try and catch blocks execute.");
    }
}