package cse360assignment02; // package
import java.util.Scanner;

/**
 * A class that builds a simple machine for
 * performing basic arithmetic while maintaining 
 * a total and a history of operations.
 * @author Guangchi Alex Lee (ASUID: 1217462649, Email: galee6@asu.edu) 
 * @version 10.7.2020
 */
public class AddingMachine {
  private int total;
  private String history;
  
  /**
   * Constructor for the AddingMachine Class,
   * It initalizes an integer to 0 and makes 
   * a "0" string for history.
   * @param none
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * Method that returns the current total of 
   * all the operations performed. 
   * @param none
   * @return integer, the total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Method that adds an integer to the current total.
   * @param value, an integer, value to be added
   * @return void
   */
  public void add (int value) {
    total += value;
    history += " + ";
    history += String.valueOf(value);
  }
  
  /**
   * Method that subtracts an integer from the current total.
   * @param value, an integer, value to be subtracted
   * @return void
   */
  public void subtract (int value) {
    total -= value;
    history += " - ";
    history += String.valueOf(value);
  }

  /**
   * Method that gives the string of operations performed.
   * @param none
   * @return String, a string of operations
   */
  public String toString () {
    return history;
  }

  /**
   * Method that clears all the operations (including history). 
   * @param none
   * @return void
   */
  public void clear() {
    total = 0;
    history = "0";
  }

  /**
   * Main function for the AddingMachine.
   * Uses scanner to read commands and 
   * perform operations using the AddingMachine
   * @param args , String[], command line arguments
   * @return none
   */
  public static void main(String[] args)
  {
    AddingMachine a = new AddingMachine();
    Scanner console = new Scanner(System.in);

    System.out.println("Welcome to CSE360 Adding Machine!");
    boolean q = false;
    while(!q)
    {
      // Print out menu
      System.out.println();
      System.out.println("Choose an operation: ");
      System.out.println("1 -- Addition");
      System.out.println("2 -- Subtraction");
      System.out.println("3 -- Get total");
      System.out.println("4 -- Get history");
      System.out.println("5 -- Clear");
      System.out.println("0 -- Quit");
      
      // Scan for integer
      if(console.hasNextInt())
      {
          int op = console.nextInt();
          switch(op) // Perform operations
          {
            case 0:
              q = true;
              break;
            case 1: // addition
              System.out.println("Integer to add: ");
              if(console.hasNextInt()) // input check
              {
                a.add(console.nextInt());
              }
              else
              {
                System.out.println("Invalid");
                console.next();
              }
              break;
            case 2: // subtraction
              System.out.println("Integer to subtract: ");
              if(console.hasNextInt()) // input check
              {
                a.subtract(console.nextInt());
              }
              else
              {
                System.out.println("Invalid");
                console.next();
              }
              break;
            case 3: // get total
              System.out.println("Total: " + a.getTotal());
              break;
            case 4: // get history
              System.out.println("History: " + a.toString());
              break;
            case 5: // clear
              a.clear();
              System.out.println("Clear");
              break;
            default: // integer but out of range
              System.out.println("Invalid operation");
              break;
          }
        }
      else // not an integer
      {
        System.out.println("Invalid operation");
        console.next();
      }

    }
    console.close(); // close scanner
    
  }
}

