import java.util.Scanner;
public class ExampleOne {

	public static void main(String[] args) {
		System.out.println("Type in a line and press Enter");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println("You have typed: " + line);
		scan.close();
		
		String numbers = "1 2 3 5 7 9";
		scan = new Scanner(numbers);
		while(scan.hasNextInt()) {
			System.out.print(scan.nextInt());
		}
		scan.close();
	}

}
