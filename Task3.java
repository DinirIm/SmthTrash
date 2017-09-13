import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		double VallisNumber = 1;

		for(int i = 2; i < n; i+=2){
			VallisNumber = VallisNumber * (n *  n) / ((n - 1) * (n + 1));
		}

		System.out.println("Pi = " + VallisNumber);
	}
}