import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);

			double t = in.nextDouble();
			double g = 9.8f;
			double h;

			h = (g * t * t) / 2;
		
			System.out.println("h" + " = " + h);
		}

}