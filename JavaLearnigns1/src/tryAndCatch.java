import java.util.InputMismatchException;
import java.util.Scanner;

//ExceptionsPrograms
public class tryAndCatch {

	//
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a value");
				int x = s.nextInt(); // non-int value raised
				double k = 44 / x; // x=0 Arithmetic exception
				System.out.println("the value is " + k);
				break; // no exception break
			}

			catch (ArithmeticException | InputMismatchException ae) {
				System.out.println(ae);
			}

		} // end while

	}

}
