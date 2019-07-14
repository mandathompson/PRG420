/**************************************************************************************
* Program:     PRG/420 Week 3
* Purpose:     Week 3 Coding Assignment
* Programmer:  Amanda Thompson
* Class:       PRG/420
* Creation Date:  06/24/2019
******************************************************************************************
* Program Summary:   For, while, and do-while loops; nested loops
*
* For this assignment, you will add code to create:
*
* a for loop nested inside another for loop
* a while loop
* a do-while loop

*****************************************************************************************/
package week3amandathompson;

/**
 *
 * @author manda
 */
public class Week3AmandaThompson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

String Asterisk = "*";
String Space = " ";
int Size = 10;

for (int i=0; i < Size; i++) {
    int Start = Size-i;
    int End = (Size*2) - Size + i;
    for (int j=0; j < Size*2; j++){
        if(j >= Start && j <= End && j%2 == i%2){
            System.out.print(Asterisk);
        }else {
            System.out.print(Space);
        }
    }
    System.out.println();
}

    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }


    int sum = 0;
    int numberOfSevens = 0;

   while (sum <= 157){
       sum = sum + 7;
       numberOfSevens++;
       if (sum >= 157){
       System.out.println("The total is: " + sum);
       System.out.println("The number of sevens used was: " + numberOfSevens);
   }
    }
   
   
   /**************************************************************************************
* Program:     PRG/420 Week 3 
* Purpose:     Week 3 Analyze Assignment 
* Programmer:  Iam A. Student         
* Class:       PRG/420       
* Creation Date:  10/22/17
******************************************************************************************
* Program Summary:   For, while, and do-while loops
* 
* This program demonstrates the syntax for the for, while, and do-while loops. It also
* contains comments that explain why a programmer would use a for loop over a while or do-while
* loop.
*
* Notice the increment operator (i++) and also notice the copious use of println() statements.
* Using System.out.println() is an excellent way to debug your code--especially if your loop code
* is giving unexpected results.
*****************************************************************************************/



        // for loops are a good choice when you have a specific number of values
        // you want to iterate over and apply some calculation to.
        System.out.println("FOR LOOP - Here are the taxes on all 10 prices:");
        
        double taxRate = 0.08;
        for (int price=1; price<=10; price++) {
            System.out.println("The 8% tax on " + price + " dollar(s) is " + "$" + (price * taxRate));
        }
        System.out.println(""); // Leave a blank space
        
        // while loops are a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // while loops MAY OR MAY NOT EVER EXECUTE, depending on the counter value.
        int dollars=1;
        System.out.println("WHILE LOOP - Here are the taxes on prices less than $5:");
        while (dollars < 5) {
             System.out.println("The 8% tax on " + dollars + " dollar(s) is $" + (dollars * taxRate));
             dollars++;
        }
        System.out.println(""); // Leave a blank space
        
        // do-while loops are also a good choice when you're looking through a pile of values
        // and want to execute some logic while some condition is true.
        // do while loops ALWAYS EXECUTE AT LEAST ONCE, no matter what the counter value.
        // For example, in the code below, we want to print out the tax only on those 
        // amounts smaller than $1.  But because we're using the do-while loop, the code
        // will execute the body of the loop once before it even checks the condition! So
        // we will get an INCORRECT PRINTOUT.
        dollars=1;
        
        System.out.println("DO-WHILE LOOP - Here are the taxes on prices less than $1:");
        
        do {
             System.out.println("The 8% tax on " + dollars + " dollar(s) is $" + (dollars * 0.08));
             dollars++;
        } while (dollars < 1);
    }
}
   

    




