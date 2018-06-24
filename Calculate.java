import java.lang.Math;

public class Calculate {

	public static void main(String[] arg) {

		System.out.println("Calculating...");

		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int addition = first + second;
		int subtraction = first - second;
		int multiplication = first * second;
		double division = (double)first / (double)second;
		double involution = Math.pow(first, second);

		System.out.println("addition = " + addition);
		System.out.println("subtraction = " + subtraction);
		System.out.println("multiplicaation = " + multiplication);
		System.out.println("division = " + division);
		System.out.println("involution = " + (int)involution);
	}
}