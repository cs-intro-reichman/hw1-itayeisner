// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // convert str input to int
		int innum = Integer.parseInt(args [0]);
		// calc the ones by modulu and delete from the input 
		int ones = innum%10; 
		innum = innum/10;
		// calc the tens by modulu and delete from the input
		int tens = innum%10;
		innum = innum/10;
		// calc the hundreds and print
		int hundreds = innum;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
