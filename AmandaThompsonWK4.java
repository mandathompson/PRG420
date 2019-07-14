        /**********************************************************************
* Program:  PRG/420 Week 4 
* Purpose:     Week 4 Coding Assignment
* Programmer:  Amanda Thompson       
*  Class:       PRG/420       
*  Creation Date:  1st July 2019 
******/

package amandathompsonwk4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 *
 * @author manda
 */
public class AmandaThompsonWK4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        int[] num = new int[10];
        Scanner myScanner = new Scanner(System.in); 
        boolean success= false;
        int i = 0;
        int total = 0;
        
    while (!success) {
        try {
            System.out.println("Enter an integer and hit Return: ");
            num[i] = myScanner.nextInt();
            System.out.println("You entered " + num[i]);
            System.out.println("You can follow directions!");
            
        } catch (InputMismatchException e) {
            System.out.println("You have entered invalid data.");
            return;
        }
        finally {
            success = true;
        }
        
        System.out.println("Enter an integer and hit Return: ");
        num[i] = myScanner.nextInt();
        
        while (i < num.length-1){
        total = num[i] + 100;
        System.out.println("The numnber is " + total);   
        i++;
        num[i] = total;
        }      
    }
    }
}
        
        
        

