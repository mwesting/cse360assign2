
/*
 * Mitch Westing
 * CSE360
 * Assignment2
 */
/**
 * This class Adds and Subtracts from the current total,
 * and keeps a log of all operations already done,
 * which can be printed by the toString method
 * 
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	* Constructor, initializes the total variable to 0
	* 
	*/
	public AddingMachine () {
	total = 0; // not needed - included for clarity
	history="0";
	}
	
	/**
	* Returns the current total
	* 
	* @return total 
	*/
	public int getTotal () {
	return total;
	}
	
	/**
	* Adds the value to the current total, and stores the operation
	* 
	* @param value an int value that will be added to the current total
	*/
	public void add (int value) {
	total = total + value;
	history += "+";
	history += Integer.toString(value);
	}
	
	/**
	* Subtracts the vale to the current total, and stores the operation
	* 
	* @param value an int value that will be subrracted from the current total
	*/
	public void subtract (int value) {
	total = total - value;
	history += " - ";
	history += Integer.toString(value);
	}
	
	/**
	* Prints the history of operations used
	* 
	*/
	public String toString () {
	return history;
	}

	public void clear() {
	
	}
}