// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int rand1 = (int) (Math.random() * range);
		int rand2 = (int) (Math.random() * range);
		int rand3 = (int) (Math.random() * range);
		int a =  Math.min(rand1,rand2);
		int min = Math.min(rand3, a);
		int c = Math.max(rand1, rand2);
		int max = Math.max(c, rand3);
		int sum = rand1 + rand2 + rand3;
		int mid = sum - (max+min);
		System.out.println(rand1 + " " + rand2 +" " + rand3);
		System.out.println(min + " " + mid +" " + max);
	}
}
