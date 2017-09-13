import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		double r = in.nextDouble();
		double C;
		double S;

		C = 2 * Math.PI * r;
		S = Math.PI * r * r;

		System.out.println("C " + "= " + C);
		System.out.println("S " + "= " + S);
	}
}