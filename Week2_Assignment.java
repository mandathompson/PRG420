/**********************************************************************
* Program:  PRG/420 Week 2 
* Purpose:     Week 2 Coding Assignment
* Programmer:  Amanda Thompson         
*  Class:       PRG/420       
*  Creation Date:  6/17/19
*********************************************************************
*/

package week2_assignment;

import java.util.Scanner;

/**
 *
 * @author manda
 */
public class Week2_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String userInputStringOfAngles;  
        int numberOfAngles; 

        Scanner myInputScannerInstance = new Scanner(System.in); // Recognize the keyboard
        System.out.print("Please type the integer 3, 4, or 5 and then press Enter: "); // Prompt the user
        userInputStringOfAngles= myInputScannerInstance.next(); // Capture user input as string
        numberOfAngles = Integer.parseInt(userInputStringOfAngles); // Convert the string to a number in case this will be useful later            
        
        while (numberOfAngles < 3 || numberOfAngles > 5) {
            System.out.println("The number " + numberOfAngles + " is incorrect; please try again.");
            System.out.print("Please type the integer 3, 4, or 5 and then press Enter: "); 
            userInputStringOfAngles= myInputScannerInstance.next(); 
            numberOfAngles = Integer.parseInt(userInputStringOfAngles);
        }
        
        /*if (numberOfAngles < 3 || numberOfAngles > 5){
            System.out.println("The number " + numberOfAngles + " is incorrect; please try again.");
            System.out.print("Please type the integer 3, 4, or 5 and then press Enter: "); 
            userInputStringOfAngles= myInputScannerInstance.next(); 
            numberOfAngles = Integer.parseInt(userInputStringOfAngles);
        } else {
            System.out.println("The number you entered is correct!");
        }*/
        
        System.out.println("Thank you for following directions!");
        
        switch (numberOfAngles) {
            case 3:
                System.out.println("A triangle has three sides.");
                break;
            case 4:
                System.out.println("A rectangle has four sides.");
                break;
            case 5:
                System.out.println("A pentagon has five sides.");
                break;
            }
        
           
      }
    }







