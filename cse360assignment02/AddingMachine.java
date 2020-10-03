package cse360assignment02; // package

/**
 * A class that builds a simple machine for
 * performing basic arithmetic while maintaining 
 * a total and a history of operations.
 * @author Guangchi Alex Lee (ASUID: 1217462649, Email: galee6@asu.edu) 
 * @version 10.7.2020
 */
public class AddingMachine {
  private int total;
  
  /**
   * Constructor for the AddingMachine Class,
   * It initalizes an integer to 0 and makes 
   * a "0" string for history.
   * @param none
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Method that returns the current total of 
   * all the operations performed. 
   * @param none
   * @return integer, the total
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * Method that adds an integer to the current total.
   * @param value, an integer, value to be added
   * @return void
   */
  public void add (int value) {
  }
  
  /**
   * Method that subtracts an integer from the current total.
   * @param value, an integer, value to be subtracted
   * @return void
   */
  public void subtract (int value) {
  }

  /**
   * Method that gives the string of operations performed.
   * @param none
   * @return String, a string of operations
   */
  public String toString () {
    return "";
  }

  /**
   * Method that clears all the operations (including history). 
   * @param none
   * @return void
   */
  public void clear() {
  }
}

