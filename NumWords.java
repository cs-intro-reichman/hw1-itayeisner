// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int innum = Integer.parseInt(args [0]);
		int ones = innum%10;
		innum = innum/10;
		int tens = innum%10;
		innum = innum/10;
		int hundreds = innum;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
