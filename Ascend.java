// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// convert str lim to int and random numbers {0,lim)
		int lim = Integer.parseInt(args [0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		// finding the max,min and mid and print
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a,b),c);
		int center = a+b+c-max-min;

		System.out.println(a+" "+b+" "+c);
		System.out.println(min+" "+center+" "+max);
	}
}
