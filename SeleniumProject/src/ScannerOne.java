import java.util.Scanner;

/**
 * 
 */

/**
 * @author Balanarasimha
 *
 */
public class ScannerOne {

	public void one() {
		System.out.println("enter1 your choice");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a % 2 == 0) {
			switch (a) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");
			case 4:
				System.out.println("four");
			default:
				System.out.println("out of the loop");
				break;

			}
		}

	}

	public static void main(String[] args) {
		ScannerOne one = new ScannerOne();
		one.one();
	}

}
