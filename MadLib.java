/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlib;

import java.util.Scanner;

/**
 *
 * @author manda
 */
public class MadLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a name: ");
      String name1 = keyboard.next();
      
      System.out.println("Please enter an adjective: ");
      String adjective1 = keyboard.next();
      System.out.println("Please enter another adjective: ");
      String adjective2 = keyboard.next();
      System.out.println("Please enter another adjective: ");
      String adjective3 = keyboard.next();
      
      System.out.println("Please enter a verb: ");
      String verb1 = keyboard.next();
      
      
      System.out.println("Please enter a noun: ");
      String noun1 = keyboard.next();
      System.out.println("Please enter another noun: ");
      String noun2 = keyboard.next();
      System.out.println("Please enter another noun: ");
      String noun3= keyboard.next();
      System.out.println("Please enter another noun: ");
      String noun4 = keyboard.next();
      System.out.println("Please enter another noun: ");
      String noun5= keyboard.next();
      System.out.println("Please enter another noun: ");
      String noun6= keyboard.next();
      
      System.out.println("Please enter a name for a character: ");
      String name2= keyboard.next();
      
      System.out.println("Please enter a number: ");
      int number = keyboard.nextInt();
      
      System.out.println("Please enter the name of a place: ");
      String place1 = keyboard.next();
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!'\nOutside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. \nThey began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+"."
              + "\nConcerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+".\n" +name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      
      System.out.println(story);
    }       
}

        
    
    

