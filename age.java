import java.time.LocalDate;
import java.util.Scanner;

class age {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String name = "";

		int current_year = LocalDate.now().getYear();

		System.out.println("Name: ");
		String myName = scanner.nextLine();

		System.out.print("year:");
		int birth_year = scanner.nextInt();

		int age = current_year - birth_year;

		System.out.println("My name is " + myName);
		System.out.println("My age is " + age + " years old.");
	}
}