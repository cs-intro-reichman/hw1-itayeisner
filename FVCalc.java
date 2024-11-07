// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// convert input strings to int/double
		int currentValue = Integer.parseInt( args [0]);
		double rate = Double.parseDouble( args [1]);
		int years = Integer.parseInt( args [2]);
		// calc the result by the formula in the HW task
		double fv = currentValue*(Math.pow((double)(1+rate/100),(double)years)); 
		System.out.println("After " + years + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int) fv);
	}
}