package part_1;

import java.util.Scanner;

public class Parameters {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Parameter  object = new Parameter ();
		
		System.out.println("Enter your name- ");
		String name = n.nextLine();
		object.simpleMessage(name);// It sets simple message to name

	}
}
