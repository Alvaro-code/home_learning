package part_1;

import java.util.Scanner;

public class Many_methods {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Many_method object = new Many_method();
		System.out.println("Enter a thing- ");
		String n = s.nextLine();
		object.setName(n);//It sets set name to n
		object.saying();

	}

}
