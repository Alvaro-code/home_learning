package part_1;

import java.util.Scanner;

public class Tutorial_15 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		_15_  object = new _15_ ();
		
		System.out.println("Enter your name- ");
		String name = n.nextLine();
		object.simpleMessage(name);// It sets simple message to name

	}
}