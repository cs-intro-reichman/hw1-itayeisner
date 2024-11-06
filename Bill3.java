// Splits a restaurant bill evenly among three diners.
public class Bill3 {

	public static void main(String[] args) {
		//inputs
	   String name1 = args[0];
	   String name2 = args[1];
	   String name3 = args[2];
		int samount = Integer.parseInt(args[3]);

		// calc the payment per person + ciel up
		double each = (samount)/3.0;
		   double ans = Math.ceil(each);
		
		 System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1  + ": Pay " + ans + " Shekels each.");
	
		}
	}
		
