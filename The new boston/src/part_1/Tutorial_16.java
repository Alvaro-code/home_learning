package part_1;

import java.util.Scanner;

public class Tutorial_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		_16_ object = new _16_();
		System.out.println("Enter a thing- ");
		String n = s.nextLine();
		object.setName(n);//It sets set name to n
		object.saying();

	}

}
