package operator;

public class Unary {
	public static void main(String[] args) {
		int x = 13, y = 9;
		x = -x; y = +y;
		System.out.println("Nilai x = " + x);
		System.out.println("Nilai y = " + y);
		System.out.print("-x + y = ");
		System.out.println(-x + y);
		System.out.print("y - x = ");
		System.out.println(y - x);
		y = ++y;
		System.out.println("Nilai y Increment = " + y);
		y = --y; y = --y; y = --y;
		System.out.println("Nilai y Decrement = " + y);
	}	
}
