import java.util.Scanner;
import java.util.InputMismatchException;
public class InputClass {
	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int a = in.nextInt();
			System.out.println("You have entered : " + a);
			in.nextLine();
			System.out.print("Enter a String : ");
			String b = in.nextLine();
			System.out.println("You have entered :" + b);
			
			System.out.print("Enter a Float : ");
			float c = in.nextFloat();
			System.out.println("You have entered :" + c);
		}
		catch (InputMismatchException e) {
			System.out.println("You have entered wrong type of data :-(");
		}
	}
}
