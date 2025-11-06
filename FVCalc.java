// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double current = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]); 
		double realRatingnum = rate/100;
		int num = Integer.parseInt(args[2]);

		double futurevalue = current * Math.pow(1+ realRatingnum, num);

		System.out.println("After " + num + " years, $" + (int)current + " saved at " + rate + "% will yield $" + (int)futurevalue);

	}
}