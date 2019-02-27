package game.util;

import java.util.*;
import java.util.logging.Logger;
import java.util.regex.*;

public class ScannerInt {
	private static final Scanner scanner = new Scanner(System.in);
	public static Logger logger = Logger.getLogger("");
	/**
	 * read an integer from 0 (excluded) to n (excluded) from standard input
	 * input is repeated as long as it is not correct
	 * 
	 * @param n the upper (excluded) bound for input
	 * @return the valid read input 
	 */
	public static int readInt(int n) {
		int input = -1;
		
		while (input <=0 || input >= n) {
			System.out.println("your choice (1-" + (n - 1) + ") ? ");
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException	 e){
				// consume the input (that is not an integer)
				scanner.skip(".*");
			}
			
		} 
		return input;
	}
}
