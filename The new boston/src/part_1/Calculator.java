package part_1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner bu = new Scanner(System.in);//Recieves user input
		System.out.println("Give me one number");
		int f = bu.nextInt();/*Sets f to the user input and passes it to a
								Integer*/
		System.out.println("Give me another number");
		int s = bu.nextInt();
		System.out.println(f + " + " + s + " = " + (f+s));//Adds numbers
		
	}

}
